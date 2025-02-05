package CoreJavaPractices.src.generics;

class Box<T> {
  private T value;

  // Constructor
  public Box(T value) {
    this.value = value;
  }

  // Getter
  public T getValue() {
    return value;
  }

  // Setter
  public void setValue(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Box{" + "value=" + value + '}';
  }
}

public class GenericType {
  public static void main(String[] args) {
      Box<Integer> intBox = new Box<>(123);
      System.out.println(intBox);  // Output: Box{value=123}

      // Creating a Box for String
      Box<String> strBox = new Box<>("Hello, Generics!");
      System.out.println(strBox);  // Output: Box{value=Hello, Generics!}
  }
}
