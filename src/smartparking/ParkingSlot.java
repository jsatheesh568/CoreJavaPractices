package CoreJavaPractices.src.smartparking;

public interface ParkingSlot {
  boolean isAvailable();

  void parkVehicle(String vehicleNumber);

  void releaseVehicle();

  String getSlotInfo();
}
