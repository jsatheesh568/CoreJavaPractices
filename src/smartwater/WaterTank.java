package CoreJavaPractices.src.smartwater;

public interface WaterTank {
  void fill(int liters);

  void distribute(int liters);

  String getStatus();
}
