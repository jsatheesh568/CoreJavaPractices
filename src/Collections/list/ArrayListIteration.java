package src.Collections.list;

public class ArrayListIteration {
  public static void main(String[] args) {
    java.util.List<String> stringForwardIteration = new java.util.ArrayList<>();
    stringForwardIteration.add("TATA");
    stringForwardIteration.add("Consultancy");
    stringForwardIteration.add("Services");
    System.out.println(stringForwardIteration);

    System.out.println("Forward Iteration:");
    // Forward iteration using enhanced for loop
    for (String str : stringForwardIteration) {
      System.out.println(str);
    }

    System.out.println("Backward Iteration:");
    // Backward iteration using ListIterator
    java.util.ListIterator<String> iterator =
        stringForwardIteration.listIterator(stringForwardIteration.size());
    while (iterator.hasPrevious ()) {
      System.out.println(iterator.previous());
    }
  }
}
