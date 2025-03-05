package CoreJavaPractices.src.flightbooking.payment;

import CoreJavaPractices.src.flightbooking.exception.PaymentFailureException;

public class CreditCardPayment implements Payment {
  private final String cardNumber;

  public CreditCardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void processPayment(double amount) {
    if (cardNumber.startsWith("0000")) { // Simulate payment failure
      throw new PaymentFailureException("Credit Card payment failed.");
    }
    System.out.println("✅ Payment of $" + amount + " processed via Credit Card.");
  }
}
