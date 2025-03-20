package CoreJavaPractices.src.frauddetection;

public interface FraudDetectionStrategy {
    boolean isFraudulent(Transaction transaction);
}
