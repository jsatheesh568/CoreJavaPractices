package src.Collections.list;

public class LinkedHashSetIteration {
    public static void main(String[] args){
        java.util.LinkedHashSet < String> set = new java.util.LinkedHashSet <> ();
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");

        // Unidirectional iteration
        java.util.Iterator < String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
