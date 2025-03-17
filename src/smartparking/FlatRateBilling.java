package CoreJavaPractices.src.smartparking;

public class FlatRateBilling implements BillingService {
  private static final double FLAT_RATE = 20.0;

  @Override
  public double calculateFee(long hoursParked) {
    return FLAT_RATE;
  }
}
