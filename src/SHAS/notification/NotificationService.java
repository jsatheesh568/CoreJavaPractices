package CoreJavaPractices.src.SHAS.notification;

@FunctionalInterface
public interface NotificationService {
    void send(Notification notification);
}
