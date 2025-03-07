package CoreJavaPractices.src.SHAS.notification;

public class SMSNotification implements NotificationService {
  @Override
  public void send(Notification notification) {
    System.out.println(
        "📱 SMS sent to " + notification.recipient() + ": " + notification.message());
  }
}
