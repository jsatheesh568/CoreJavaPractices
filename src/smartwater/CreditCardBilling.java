package CoreJavaPractices.src.smartwater;

public class CreditCardBilling implements BillingService {
    @Override
    public void process(Bill bill) {
        System.out.println("💳 Credit Card Payment of $" + bill.amount() + " processed for " + bill.user());
    }
}
