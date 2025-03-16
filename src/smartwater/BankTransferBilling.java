package CoreJavaPractices.src.smartwater;

public class BankTransferBilling implements BillingService {
  @Override
  public void process(Bill bill) {
    System.out.println("🏦 Bank Transfer of $" + bill.amount() + " processed for " + bill.user());
  }
}
