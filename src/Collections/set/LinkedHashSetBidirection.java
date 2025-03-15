package CoreJavaPractices.src.Collections.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

public class LinkedHashSetBidirection {
    public static void main(String[] args){
        LinkedHashSet < String> set = new LinkedHashSet <> ();
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");

        // Convert LinkedHashSet to List
        List < String> list = new ArrayList <> (set);

        // Bidirectional iteration using ListIterator
        ListIterator < String> iterator = list.listIterator();

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
