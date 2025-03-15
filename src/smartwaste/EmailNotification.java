package CoreJavaPractices.src.smartwaste;

public class EmailNotification implements NotificationService {
  @Override
  public void send(Notification notification) {
    System.out.println(
        "📧 Email sent to " + notification.recipient() + ": " + notification.message());
  }
}
