package CoreJavaPractices.src.smartwaste;

import java.time.LocalDateTime;

public record WasteReport(String binId, String status, LocalDateTime timestamp) {}
