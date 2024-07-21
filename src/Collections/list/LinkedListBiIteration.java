package src.Collections.list;

public class LinkedListBiIteration {
    public static void main(String[] args){
        java.util.LinkedList < String> list = new java.util.LinkedList <> ();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // Bidirectional iteration
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
