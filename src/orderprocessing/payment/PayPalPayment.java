package CoreJavaPractices.orderprocessing.payment;

public record PayPalPayment(String email) implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("✅ Processed PayPal Payment of $" + amount);
    }
}
