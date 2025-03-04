package CoreJavaPractices.orderprocessing.payment;

public record CreditCardPayment(String cardNumber) implements Payment {
  @Override
  public void processPayment(double amount) {
    System.out.println("✅ Processed Credit Card Payment of $" + amount);
  }
}
