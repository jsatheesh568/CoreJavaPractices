package CoreJavaPractices.src.frauddetection;

public class FraudDetectionService {
  private final FraudDetectionStrategy strategy = new AIFraudDetectionStrategy();

  public void processTransaction(Transaction transaction) {
    if (strategy.isFraudulent(transaction)) {
      System.out.println("🚨 Fraud Detected! Transaction Blocked: " + transaction);
    } else {
      System.out.println("✅ Transaction Approved: " + transaction);
    }
  }
}
