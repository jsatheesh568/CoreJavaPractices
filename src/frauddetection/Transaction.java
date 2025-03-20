package CoreJavaPractices.src.frauddetection;

import java.time.LocalDateTime;

public record Transaction(String id, String userId, double amount, String location, LocalDateTime timestamp) { }
