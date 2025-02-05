package CoreJavaPractices.src.generics;

public class BoundedTypeExample {

  public static <T extends Number> void printDouble(T number) {
    System.out.println(number.doubleValue());
  }

  public static void main(String[] args) {
    // Allowed: Integer is a subclass of Number
    printDouble(10); // Output: 10.0

    // Allowed: Double is a subclass of Number
    printDouble(10.5); // Output: 10.5

    // Not allowed: String is not a subclass of Number
    // printDouble("Hello"); // Compile-time error
  }
}
