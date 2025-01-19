package src.Collections.list;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

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

        HashMap<Integer,String> hashMap = new HashMap<> ();
        hashMap.put(1,"satheesh");
        hashMap.put ( 2,"kumar" );
         System.out.println(hashMap);

        ConcurrentHashMap < Object, Object > concurrentHashMap = new ConcurrentHashMap<> ();
        concurrentHashMap.put ( 1,"satheesh" );
        System.out.println(concurrentHashMap);
    }
}
