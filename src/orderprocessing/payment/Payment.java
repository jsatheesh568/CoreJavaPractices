package CoreJavaPractices.orderprocessing.payment;

public sealed interface Payment permits CreditCardPayment, PayPalPayment {
    void processPayment(double amount);
}
