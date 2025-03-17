package CoreJavaPractices.src.smartparking;

@FunctionalInterface
public interface BillingService {
    double calculateFee(long hoursParked);
}
