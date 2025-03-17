package CoreJavaPractices.src.smartparking;

import java.time.LocalDateTime;

public class ParkingTicket {
  private final String vehicleNumber;
  private final LocalDateTime entryTime;

  public ParkingTicket(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    this.entryTime = LocalDateTime.now();
  }

  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public LocalDateTime getEntryTime() {
    return entryTime;
  }
}
