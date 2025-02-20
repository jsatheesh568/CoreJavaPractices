package CoreJavaPractices.src.Java8.functionalinterface.FI;

/*@FunctionalInterface
interface ParentInterface {
    void show();
}

// ❌ ERROR: Adding a second abstract method breaks the functional interface rule.
@FunctionalInterface
interface ChildInterface extends ParentInterface {
    void display(); // ❌ Adding a new abstract method is NOT allowed
}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        ChildInterface obj = () -> System.out.println("Lambda for ChildInterface");
        obj.show();  // Compilation error before this point
    }
}*/

@FunctionalInterface
interface ParentInterface {
    void show();
}

// ✅ Valid: No new abstract method is added, so it's still a functional interface
@FunctionalInterface
interface ChildInterface extends ParentInterface {
    @Override
    void show(); // Same method, no new abstract methods added
}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        ChildInterface obj = () -> System.out.println("Lambda for show()");
        obj.show();  // Output: Lambda for show()
    }
}
