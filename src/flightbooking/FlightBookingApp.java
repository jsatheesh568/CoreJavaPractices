package CoreJavaPractices.src.flightbooking;

import CoreJavaPractices.src.flightbooking.exception.FlightNotFoundException;
import CoreJavaPractices.src.flightbooking.model.Flight;
import CoreJavaPractices.src.flightbooking.model.Passenger;
import CoreJavaPractices.src.flightbooking.notification.EmailNotification;
import CoreJavaPractices.src.flightbooking.notification.NotificationService;
import CoreJavaPractices.src.flightbooking.payment.CreditCardPayment;
import CoreJavaPractices.src.flightbooking.service.FlightService;

import java.util.List;
import java.util.UUID;

public class FlightBookingApp {
  public static void main(String[] args) {
    Passenger passenger = new Passenger(UUID.randomUUID(), "John Doe", "john@example.com");

    List<Flight> flights =
        List.of(
            new Flight(UUID.randomUUID(), "AI123", "Air India", 3, 500.0),
            new Flight(
                UUID.randomUUID(), "UA456", "United Airlines", 0, 700.0) // No seats available
            );

    FlightService flightService = new FlightService(flights);
    NotificationService notificationService = new EmailNotification();

    try {
      Flight flight = flightService.searchFlight("AI123");
      flightService.bookFlight(flight.id(), new CreditCardPayment ("1234-5678-9012-3456"));
      notificationService.sendNotification(
          passenger, "Your flight " + flight.flightNumber() + " is booked!");
    } catch (FlightNotFoundException e) {
      System.out.println("❌ " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("⚠️ Error: " + e.getMessage());
    }
  }
}
