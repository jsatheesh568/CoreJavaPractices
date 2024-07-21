package src.Collections.list;

public class LinkedHashmapBidirection {
    public static void main(String[] args){
        java.util.LinkedHashSet < String> set = new java.util.LinkedHashSet <> ();
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");

        // Convert LinkedHashSet to List
        java.util.List < String> list = new java.util.ArrayList <> (set);

        // Bidirectional iteration using ListIterator
        java.util.ListIterator < String> iterator = list.listIterator();

        System.out.println("Forward direction:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Backward direction:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
