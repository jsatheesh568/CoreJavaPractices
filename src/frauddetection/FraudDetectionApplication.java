package CoreJavaPractices.src.frauddetection;

import java.time.LocalDateTime;

public class FraudDetectionApplication {
  public static void main(String[] args) {
    FraudDetectionService service = new FraudDetectionService();

    Transaction tx1 = new Transaction("TXN001", "User1", 500, "New York", LocalDateTime.now());
    Transaction tx2 =
        new Transaction("TXN002", "User2", 2000, "New York", LocalDateTime.now().plusMinutes(1));
    Transaction tx3 =
        new Transaction("TXN003", "User1", 100, "Los Angeles", LocalDateTime.now().plusMinutes(5));

    service.processTransaction(tx1);
    service.processTransaction(tx2);
    service.processTransaction(tx3);
  }
}
