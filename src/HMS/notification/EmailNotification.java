package CoreJavaPractices.src.HMS.notification;

import CoreJavaPractices.src.HMS.model.Patient;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification( Patient patient, String message) {
        System.out.println("📧 Email sent to " + patient.email () + ": " + message);
    }
}
