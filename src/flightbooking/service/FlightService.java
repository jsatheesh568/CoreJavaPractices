package CoreJavaPractices.src.flightbooking.service;

import CoreJavaPractices.src.flightbooking.exception.FlightNotFoundException;
import CoreJavaPractices.src.flightbooking.model.Flight;
import CoreJavaPractices.src.flightbooking.payment.Payment;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class FlightService {
  private List<Flight> flights;

  public FlightService(List<Flight> flights) {
    this.flights = flights;
  }

  public Flight searchFlight(String flightNumber) throws FlightNotFoundException {
    return flights.stream()
        .filter(flight -> flight.flightNumber().equalsIgnoreCase(flightNumber))
        .findFirst()
        .orElseThrow(() -> new FlightNotFoundException("Flight " + flightNumber + " not found."));
  }

  public void bookFlight(UUID flightId, Payment payment) throws FlightNotFoundException {
    Optional<Flight> flightOptional =
        flights.stream().filter(f -> f.id().equals(flightId)).findFirst();

    if (flightOptional.isPresent()) {
      Flight flight = flightOptional.get();
      payment.processPayment(flight.price());
      flights =
          flights.stream()
              .map(f -> f.id().equals(flightId) ? f.reduceSeat() : f)
              .collect(Collectors.toList());

      System.out.println("✅ Flight " + flight.flightNumber() + " booked successfully!");
    } else {
      throw new FlightNotFoundException("Flight not found.");
    }
  }
}
