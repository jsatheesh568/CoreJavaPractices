package CoreJavaPractices.src.smartwaste;

import java.util.List;

public class GarbageTruck {
  private final int maxCapacity;
  private int collectedWaste = 0;

  public GarbageTruck(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public void collectWaste(List<SmartBin> bins) {
    bins.stream()
        .filter(bin -> "FULL".equals(bin.getStatus()))
        .forEach(
            bin -> {
              if (collectedWaste + 10 > maxCapacity) {
                throw new TruckOverloadException("🚛 Truck overload! Cannot collect more waste.");
              }
              bin.empty();
              collectedWaste += 10;
              System.out.println("🛻 Collected 10kg from bin.");
            });
  }
}
