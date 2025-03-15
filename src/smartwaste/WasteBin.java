package CoreJavaPractices.src.smartwaste;

public interface WasteBin {
  void fill(int amount);

  void empty();

  String getStatus();
}
