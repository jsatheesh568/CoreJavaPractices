package CoreJavaPractices.src.flightbooking.model;

import java.util.UUID;

public record Passenger(UUID id, String name, String email) {}
