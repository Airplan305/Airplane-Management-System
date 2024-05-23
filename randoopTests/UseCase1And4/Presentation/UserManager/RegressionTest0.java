
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    UseCase1And4.business.User user2 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = userManager1.register(user2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    UseCase1And4.business.User user3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = userManager1.register(user3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = userManager1.register(user4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = userManager1.register(user5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = userManager1.register(user6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = userManager1.register(user8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = userManager1.register(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user13 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = userManager1.register(user13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = userManager1.register(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user11 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = userManager1.register(user11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = userManager1.register(user7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = userManager1.register(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = userManager1.register(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = userManager1.register(user9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user17 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = userManager1.register(user17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = userManager1.register(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user19 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = userManager1.register(user19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user15 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = userManager1.register(user15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = userManager1.register(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b17 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = userManager1.register(user21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user23 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = userManager1.register(user23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = userManager1.register(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user25 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = userManager1.register(user25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b28 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = userManager1.register(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b28 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = userManager1.register(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user27 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b28 = userManager1.register(user27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b28 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b28 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = userManager1.register(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user29 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = userManager1.register(user29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user31 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = userManager1.register(user31);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = userManager1.register(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = userManager1.register(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user34 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b35 = userManager1.register(user34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user33 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = userManager1.register(user33);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b35 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b35 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b37 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b37 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b37 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user36 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b37 = userManager1.register(user36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b35 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b35 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user35 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b36 = userManager1.register(user35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b39 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user37 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = userManager1.register(user37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b37 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b40 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user38 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b39 = userManager1.register(user38);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b39 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user39 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b40 = userManager1.register(user39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b40 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b41 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b34 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b41 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b39 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b44 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user40 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b41 = userManager1.register(user40);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b42 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b43 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b43 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user41 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b42 = userManager1.register(user41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b42 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b45 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b40 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b44 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user43 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b44 = userManager1.register(user43);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b44 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user42 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b43 = userManager1.register(user42);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b46 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b43 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b40 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user44 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b45 = userManager1.register(user44);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b44 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b46 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b45 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b41 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user45 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b46 = userManager1.register(user45);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b46 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user46 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b47 = userManager1.register(user46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user47 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b48 = userManager1.register(user47);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b49 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b45 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b39 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user48 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b49 = userManager1.register(user48);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b45 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b48 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b50 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b47 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b48 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b48 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b47 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b43 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b50 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b49 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b42 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b50 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b51 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b47 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user49 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b50 = userManager1.register(user49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b52 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user50 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b51 = userManager1.register(user50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b49 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b42 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b50 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b52 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b51 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b49 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b51 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b53 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b52 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b53 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b41 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b51 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user53 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b54 = userManager1.register(user53);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b56 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user54 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b55 = userManager1.register(user54);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b55 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b54 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user51 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b52 = userManager1.register(user51);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user52 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b53 = userManager1.register(user52);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b54 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b47 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b54 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user55 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b56 = userManager1.register(user55);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b53 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b55 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b55 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user56 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = userManager1.register(user56);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b60 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b54 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b58 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b46 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b57 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user57 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b58 = userManager1.register(user57);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b60 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user58 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b59 = userManager1.register(user58);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user60 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b61 = userManager1.register(user60);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user59 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b60 = userManager1.register(user59);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b53 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b58 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b59 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b63 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user62 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b63 = userManager1.register(user62);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b62 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b56 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b61 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b52 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b64 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b64 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b48 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user61 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b62 = userManager1.register(user61);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b58 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b61 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b55 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b62 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b59 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b62 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b61 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b64 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b60 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b56 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b61 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b62 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b63 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b63 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user63 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b64 = userManager1.register(user63);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b60 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b65 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user64 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b65 = userManager1.register(user64);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b65 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b59 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b66 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b59 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b67 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b65 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user65 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b66 = userManager1.register(user65);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b67 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b65 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b67 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b58 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b63 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b66 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user66 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b67 = userManager1.register(user66);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b66 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b66 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user67 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b68 = userManager1.register(user67);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b69 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b69 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b69 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b69 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b56 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user69 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b70 = userManager1.register(user69);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b70 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b68 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b70 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b68 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user68 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b69 = userManager1.register(user68);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b71 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b68 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b72 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b75 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b71 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user71 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b72 = userManager1.register(user71);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b74 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b73 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user70 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b71 = userManager1.register(user70);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user74 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b75 = userManager1.register(user74);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b71 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user73 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b74 = userManager1.register(user73);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b74 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b76 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user72 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b73 = userManager1.register(user72);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b64 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b74 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b70 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b68 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b74 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b76 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b71 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user75 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b76 = userManager1.register(user75);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b72 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b77 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b73 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b72 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b73 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b67 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b77 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b76 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user76 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b77 = userManager1.register(user76);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b78 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b77 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b77 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b72 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b73 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b78 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user78 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b79 = userManager1.register(user78);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b80 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b81 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b81 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b78 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user77 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b78 = userManager1.register(user77);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b81 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b76 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b75 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b78 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b81 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b80 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user79 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b80 = userManager1.register(user79);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b79 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user82 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b83 = userManager1.register(user82);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b80 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b79 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b83 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user81 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b82 = userManager1.register(user81);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user80 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b81 = userManager1.register(user80);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b84 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b83 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b82 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b82 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b75 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b85 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b85 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b84 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b79 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user84 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b85 = userManager1.register(user84);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user83 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b84 = userManager1.register(user83);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b85 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b80 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b79 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user85 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b86 = userManager1.register(user85);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user86 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b87 = userManager1.register(user86);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b83 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b70 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b86 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b84 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b75 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b83 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b89 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b88 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b85 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b89 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b87 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b87 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b87 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b88 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user87 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b88 = userManager1.register(user87);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b89 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user88 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b89 = userManager1.register(user88);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b86 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b82 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b88 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b91 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user92 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b93 = userManager1.register(user92);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user90 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b91 = userManager1.register(user90);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b86 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b92 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b91 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user89 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b90 = userManager1.register(user89);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b94 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b92 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b87 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b90 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user93 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b94 = userManager1.register(user93);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user91 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b92 = userManager1.register(user91);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user94 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b95 = userManager1.register(user94);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b91 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b89 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b93 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user95 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b96 = userManager1.register(user95);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b97 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b96 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b82 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b98 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b88 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b93 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user96 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b97 = userManager1.register(user96);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b91 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b95 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b96 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b84 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b96 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b93 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b90 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b94 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b90 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b94 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b94 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b95 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b96 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b97 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b98 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b95 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b97 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b92 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b90 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b98 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b93 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b97 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b98 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b95 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b92 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user97 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b98 = userManager1.register(user97);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b99 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b99 = userManager1.login("", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b99 = userManager1.login("", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    UseCase1And4.business.User user98 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b99 = userManager1.register(user98);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b99 = userManager1.login("hi!", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    UseCase1And4.data.UserDAO userDAO0 = null;
    UseCase1And4.presentation.UserManager userManager1 = new UseCase1And4.presentation.UserManager(userDAO0);
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    userManager1.logout();
    // The following exception was thrown during execution in test generation
    try {
    boolean b86 = userManager1.login("hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
