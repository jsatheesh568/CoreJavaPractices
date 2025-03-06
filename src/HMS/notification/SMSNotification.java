package CoreJavaPractices.src.HMS.notification;

import CoreJavaPractices.src.HMS.model.Patient;

public class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(Patient patient, String message) {
        System.out.println("📱 SMS sent to " + patient.mobileNumber() + ": " + message);
    }
}