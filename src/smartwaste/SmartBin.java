package CoreJavaPractices.src.smartwaste;

public class SmartBin implements WasteBin {
  private final int capacity;
  private int currentLevel = 0;

  public SmartBin(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public void fill(int amount) {
    if (currentLevel + amount > capacity) {
      throw new BinOverflowException("🚨 Bin overflow detected! Capacity exceeded.");
    }
    currentLevel += amount;
    System.out.println("🗑️ Bin filled. Current Level: " + currentLevel);
  }

  @Override
  public void empty() {
    currentLevel = 0;
    System.out.println("✅ Bin emptied.");
  }

  @Override
  public String getStatus() {
    return currentLevel >= capacity ? "FULL" : (currentLevel > 0 ? "PARTIAL" : "EMPTY");
  }
}
