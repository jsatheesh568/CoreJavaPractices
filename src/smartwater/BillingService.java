package CoreJavaPractices.src.smartwater;

@FunctionalInterface
public interface BillingService {
  void process(Bill bill);
}
