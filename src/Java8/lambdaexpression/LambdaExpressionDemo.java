package src.Java8.lambdaexpression;

// Define a functional interface
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething(); // Abstract method
}

// Main class to demonstrate lambda expressions
public class LambdaExpressionDemo {

    public static void main(String[] args) {
        // Implement the interface using a lambda expression
        MyFunctionalInterface lambdaFunc = () -> System.out.println("Doing something with lambda expression");

        // Invoke the abstract method using the lambda expression
        lambdaFunc.doSomething();
    }
}
