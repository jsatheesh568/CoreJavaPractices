package CoreJavaPractices.src.smartparking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class SmartParkingApplication {
  public static void main(String[] args) {
    List<ParkingSlot> slots = Arrays.asList(new CompactSlot("C1"), new LargeSlot("L1"));

    ParkingLotManager manager = new ParkingLotManager(slots);
    BillingService billingService = new HourlyBilling();

    try {
      System.out.println(manager.parkVehicle("ABC123"));
      ParkingTicket ticket = new ParkingTicket("ABC123");

      Thread.sleep(2000);

      manager.releaseVehicle("ABC123");
      long hoursParked = Duration.between(ticket.getEntryTime(), LocalDateTime.now()).toHours();
      System.out.println("🚗 Parking fee: $" + billingService.calculateFee(hoursParked));

      manager.displaySlots();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
