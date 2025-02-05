package CoreJavaPractices.src.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample {

  // Method with unbounded wildcard
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }

  // Method with upper-bounded wildcard
  public static void printNumbers(List<? extends Number> list) {
    for (Number num : list) {
      System.out.println(num);
    }
  }

  // Method with lower-bounded wildcard
  public static void addNumbers(List<? super Integer> list) {
    list.add(10);
    list.add(20);
  }

  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("A", "B", "C");
    List<Integer> intList = Arrays.asList(1, 2, 3);

    printList(stringList); // Output: A B C
    printList(intList); // Output: 1 2 3

    printNumbers(intList); // Output: 1 2 3

    List<Number> numList = new ArrayList<>();
    addNumbers(numList);
    System.out.println(numList); // Output: [10, 20]
  }
}
