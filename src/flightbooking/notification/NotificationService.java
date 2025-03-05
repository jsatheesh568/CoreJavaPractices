package CoreJavaPractices.src.flightbooking.notification;

import CoreJavaPractices.src.flightbooking.model.Passenger;
@FunctionalInterface
public interface NotificationService {
    void sendNotification(Passenger passenger, String message);
}