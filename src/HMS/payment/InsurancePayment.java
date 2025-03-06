package CoreJavaPractices.src.HMS.payment;

import CoreJavaPractices.src.HMS.service.BillingService;

public class InsurancePayment implements BillingService {
    @Override
    public void processBill(double amount) {
        System.out.println("✅ Bill of $" + amount + " covered by Insurance.");
    }
}
