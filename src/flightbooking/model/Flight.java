package CoreJavaPractices.src.flightbooking.model;

import java.util.UUID;

public record Flight(UUID id, String flightNumber, String airline, int availableSeats, double price) {
    public Flight reduceSeat() {
        if (availableSeats <= 0) {
            throw new RuntimeException("No available seats on this flight.");
        }
        return new Flight(id, flightNumber, airline, availableSeats - 1, price);
    }
}
