package src.SOLIDPrinciples.DependencyInversion;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}