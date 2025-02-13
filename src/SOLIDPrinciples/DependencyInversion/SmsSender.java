package src.SOLIDPrinciples.DependencyInversion;

public class SmsSender implements src.SOLIDPrinciples.DependencyInversion.MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}