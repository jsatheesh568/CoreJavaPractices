package CoreJavaPractices.src.flightbooking.payment;

public class PayPalPayment implements Payment {
  private final String email;

  public PayPalPayment(String email) {
    this.email = email;
  }

  @Override
  public void processPayment(double amount) {
    System.out.println("✅ Payment of $" + amount + " processed via PayPal.");
  }
}
