package CoreJavaPractices.src.smartwater;

import java.util.List;

public class WaterDistributionSystem {
  public void distributeWater(List<SmartWaterTank> tanks, int litersPerTank) {
    tanks.stream()
        .filter(tank -> !"EMPTY".equals(tank.getStatus()))
        .forEach(
            tank -> {
              tank.distribute(litersPerTank);
              System.out.println("✅ Water successfully distributed.");
            });
  }
}
