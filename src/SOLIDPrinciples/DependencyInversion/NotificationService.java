package src.SOLIDPrinciples.DependencyInversion;

public class NotificationService {
    private src.SOLIDPrinciples.DependencyInversion.MessageSender messageSender;

    public NotificationService( src.SOLIDPrinciples.DependencyInversion.MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}
