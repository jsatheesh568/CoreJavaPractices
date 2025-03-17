package CoreJavaPractices.src.smartparking;

public abstract class AbstractParkingSlot implements ParkingSlot {
  protected String slotId;
  protected boolean occupied;
  protected String vehicleNumber;

  public AbstractParkingSlot(String slotId) {
    this.slotId = slotId;
    this.occupied = false;
  }

  @Override
  public boolean isAvailable() {
    return !occupied;
  }

  @Override
  public void parkVehicle(String vehicleNumber) {
    if (occupied) {
      throw new IllegalStateException("⚠ Slot is already occupied!");
    }
    this.vehicleNumber = vehicleNumber;
    this.occupied = true;
  }

  @Override
  public void releaseVehicle() {
    this.vehicleNumber = null;
    this.occupied = false;
  }

  @Override
  public String getSlotInfo() {
    return "Slot: "
        + slotId
        + " | Available: "
        + !occupied
        + " | Vehicle: "
        + (vehicleNumber != null ? vehicleNumber : "None");
  }
}
