
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test1"); }

    UseCase1And4.data.PaymentDAO paymentDAO0 = null;
    UseCase1And4.presentation.PaymentManager paymentManager1 = new UseCase1And4.presentation.PaymentManager(paymentDAO0);
    // The following exception was thrown during execution in test generation
    try {
    UseCase1And4.business.Payment payment3 = paymentManager1.refund("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test2"); }

    UseCase1And4.data.PaymentDAO paymentDAO0 = null;
    UseCase1And4.presentation.PaymentManager paymentManager1 = new UseCase1And4.presentation.PaymentManager(paymentDAO0);
    // The following exception was thrown during execution in test generation
    try {
    UseCase1And4.business.Payment payment3 = paymentManager1.refund("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test3"); }

    UseCase1And4.data.PaymentDAO paymentDAO0 = null;
    UseCase1And4.presentation.PaymentManager paymentManager1 = new UseCase1And4.presentation.PaymentManager(paymentDAO0);
    // The following exception was thrown during execution in test generation
    try {
    UseCase1And4.business.Payment payment3 = paymentManager1.cancelPayment("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test4"); }

    UseCase1And4.data.PaymentDAO paymentDAO0 = null;
    UseCase1And4.presentation.PaymentManager paymentManager1 = new UseCase1And4.presentation.PaymentManager(paymentDAO0);
    UseCase1And4.business.Payment payment2 = null;
    // The following exception was thrown during execution in test generation
    try {
    UseCase1And4.business.Payment payment3 = paymentManager1.makePayment(payment2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test5"); }

    UseCase1And4.data.PaymentDAO paymentDAO0 = null;
    UseCase1And4.presentation.PaymentManager paymentManager1 = new UseCase1And4.presentation.PaymentManager(paymentDAO0);
    // The following exception was thrown during execution in test generation
    try {
    UseCase1And4.business.Payment payment3 = paymentManager1.cancelPayment("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
