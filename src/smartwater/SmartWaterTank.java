package CoreJavaPractices.src.smartwater;

public class SmartWaterTank implements WaterTank {
  private final int capacity;
  private int currentLevel = 0;
  private boolean leakDetected = false;

  public SmartWaterTank(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public void fill(int liters) {
    if (leakDetected) {
      throw new LeakageDetectedException("🚨 Leak detected! Fix it before refilling.");
    }
    if (currentLevel + liters > capacity) {
      throw new TankOverflowException("⚠️ Tank overflow detected! Capacity exceeded.");
    }
    currentLevel += liters;
    System.out.println("💧 Tank filled. Current Level: " + currentLevel);
  }

  @Override
  public void distribute(int liters) {
    if (liters > currentLevel) {
      throw new IllegalArgumentException("❌ Not enough water available.");
    }
    currentLevel -= liters;
    System.out.println("🚰 Water distributed: " + liters + "L. Remaining: " + currentLevel + "L.");
  }

  @Override
  public String getStatus() {
    return currentLevel >= capacity ? "FULL" : (currentLevel > 0 ? "PARTIAL" : "EMPTY");
  }

  public void detectLeak() {
    leakDetected = true;
    System.out.println("⚠️ Water leakage detected! Immediate action required.");
  }
}
