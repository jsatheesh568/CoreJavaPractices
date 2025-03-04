package CoreJavaPractices.orderprocessing;

@FunctionalInterface
public interface NotificationSender {
    void send(String message);
}
