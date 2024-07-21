package src.Java8.methodreference;

// A class to demonstrate method references
class MessagePrinter {
    // A static method to print a message
    static void printMessage(String message) {
        System.out.println(message);
    }
}

// Main class to demonstrate method references
public class MethodReferenceDemo {

    public static void main(String[] args) {
        // Using a lambda expression
        java.util.function.Consumer < String> lambdaConsumer = ( msg) -> System.out.println(msg);
        lambdaConsumer.accept("Using lambda expression");

        // Using a method reference to a static method
        java.util.function.Consumer < String> methodRefConsumer = MessagePrinter::printMessage;
        methodRefConsumer.accept("Using method reference");
    }
}
