package CoreJavaPractices.src.contentmoderation;

public class NotificationService {
  public void notifyAdmin(UserPost post, String reason) {
    NotificationSender emailSender =
        message -> System.out.println("📧 Email sent to admin: " + message);

    NotificationSender smsSender =
        message -> System.out.println("📱 SMS sent to moderator: " + message);

    emailSender.send("🚨 Alert! Post by " + post.username() + " flagged: " + reason);
    smsSender.send("🚨 Moderator alert: " + reason);
  }
}
