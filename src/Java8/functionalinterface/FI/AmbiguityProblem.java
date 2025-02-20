package CoreJavaPractices.src.Java8.functionalinterface.FI;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

@FunctionalInterface
interface Adder {
    int add(int x, int y);
}

public class AmbiguityProblem {
    public static void main(String[] args) {
        /*// ❌ Compilation Error: Cannot resolve add() due to ambiguity
        Calculator calc = (a, b) -> a + b;
        Adder adder = calc; // ❌ Error: Which add() to use?
        //java: incompatible types: CoreJavaPractices.src.Java8.functionalinterface.FI.Calculator cannot be converted to CoreJavaPractices.src.Java8.functionalinterface.FI.Adder*/

       /* Calculator calc = (a, b) -> a + b;
        Adder adder = (Adder) calc;  // ✅ Explicit Type Casting
        System.out.println(adder.add(10, 20)); // Exception in thread "main" java.lang.ClassCastException: class CoreJavaPractices.src.Java8.functionalinterface.FI.AmbiguityProblem$*/

        Calculator calcu = (a, b) -> a + b;
        Adder adders = (x, y) -> x + y;  // ✅ Define separately
        System.out.println(calcu.add(10, 20)); // Output: 30
        System.out.println(adders.add(5, 15)); // Output: 20
    }
}
