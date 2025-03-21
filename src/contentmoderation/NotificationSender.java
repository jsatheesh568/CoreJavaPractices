package CoreJavaPractices.src.contentmoderation;

@FunctionalInterface
interface NotificationSender {
    void send(String message);
}
