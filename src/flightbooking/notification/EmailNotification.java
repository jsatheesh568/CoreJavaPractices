package CoreJavaPractices.src.flightbooking.notification;

import CoreJavaPractices.src.flightbooking.model.Passenger;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification( Passenger passenger, String message) {
        System.out.println("📧 Email sent to " + passenger.email() + ": " + message);
    }
}
