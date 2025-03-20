package CoreJavaPractices.src.frauddetection;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class AIFraudDetectionStrategy implements FraudDetectionStrategy {
  private final Map<String, Transaction> lastTransactions = new HashMap<>();

  @Override
  public boolean isFraudulent(Transaction transaction) {
    Transaction lastTx = lastTransactions.get(transaction.userId());

    if (lastTx != null) {
      // Check for rapid multiple transactions
      if (Duration.between(lastTx.timestamp(), transaction.timestamp()).toMinutes() < 2
          && transaction.amount() > lastTx.amount() * 3) {
        return true;
      }

      // Check for transactions from different locations in a short time
      if (!lastTx.location().equals(transaction.location())
          && Duration.between(lastTx.timestamp(), transaction.timestamp()).toMinutes() < 10) {
        return true;
      }
    }

    lastTransactions.put(transaction.userId(), transaction);
    return false;
  }
}
