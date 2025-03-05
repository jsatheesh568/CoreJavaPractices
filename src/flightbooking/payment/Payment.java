package CoreJavaPractices.src.flightbooking.payment;

@FunctionalInterface
public interface Payment {
    void processPayment(double amount);
}
