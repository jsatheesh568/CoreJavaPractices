package src.SOLIDPrinciples.DependencyInversion;

public class EmailSender implements src.SOLIDPrinciples.DependencyInversion.MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}