package CoreJavaPractices.src.HMS.payment;

import CoreJavaPractices.src.HMS.service.BillingService;

public class CreditCardPayment implements BillingService {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processBill(double amount) {
        if (cardNumber.startsWith("0000")) {
            throw new RuntimeException("Credit Card payment failed.");
        }
        System.out.println("✅ Bill of $" + amount + " processed via Credit Card.");
    }
}

