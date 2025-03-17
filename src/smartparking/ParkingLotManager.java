package CoreJavaPractices.src.smartparking;

import java.util.List;
import java.util.Optional;

public class ParkingLotManager {
  private final List<ParkingSlot> slots;

  public ParkingLotManager(List<ParkingSlot> slots) {
    this.slots = slots;
  }

  public String parkVehicle(String vehicleNumber) {
    Optional<ParkingSlot> availableSlot =
        slots.stream().filter(ParkingSlot::isAvailable).findFirst();

    if (availableSlot.isPresent()) {
      ParkingSlot slot = availableSlot.get();
      slot.parkVehicle(vehicleNumber);
      return slot.getSlotInfo();
    } else {
      throw new NoAvailableSlotException("❌ No available slots!");
    }
  }

  public void releaseVehicle(String vehicleNumber) {
    Optional<ParkingSlot> occupiedSlot =
        slots.stream()
            .filter(slot -> !slot.isAvailable() && slot.getSlotInfo().contains(vehicleNumber))
            .findFirst();

    occupiedSlot.ifPresent(ParkingSlot::releaseVehicle);
  }

  public void displaySlots() {
    slots.forEach(slot -> System.out.println(slot.getSlotInfo()));
  }
}
