package CoreJavaPractices.src.smartparking;

public class HourlyBilling implements BillingService {
  private static final double RATE_PER_HOUR = 5.0;

  @Override
  public double calculateFee(long hoursParked) {
    return hoursParked * RATE_PER_HOUR;
  }
}
