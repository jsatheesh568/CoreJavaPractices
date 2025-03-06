package CoreJavaPractices.src.HMS.notification;

import CoreJavaPractices.src.HMS.model.Patient;

@FunctionalInterface
public interface NotificationService {
    void sendNotification( Patient patient, String message);
}
