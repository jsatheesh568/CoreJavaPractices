package src.Java8.functionalinterface;
// Define a functional interface
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething(); // Abstract method

    // Default method
    default void doSomethingElse() {
        System.out.println("Doing something else");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method");
    }
}

// Main class to demonstrate the functional interface
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        // Implement the interface using a lambda expression
        MyFunctionalInterface lambdaFunc = () -> System.out.println("Lambda: Doing something");

        // Implement the interface using a method reference
        MyClass obj = new MyClass();
        MyFunctionalInterface methodRefFunc = obj::someMethod;

        // Invoke the abstract method using lambda expression
        lambdaFunc.doSomething();

        // Invoke the abstract method using method reference
        methodRefFunc.doSomething();

        // Invoke the default method
        lambdaFunc.doSomethingElse();
        methodRefFunc.doSomethingElse(); // Demonstrating default method through method reference

        // Invoke the static method
        MyFunctionalInterface.staticMethod();
    }
}

// Helper class with a method for method reference
class MyClass {
    void someMethod() {
        System.out.println("Method Reference: Doing something");
    }
}
