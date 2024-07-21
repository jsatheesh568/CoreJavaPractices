package src.Collections.list;
public class ArrayListDemo {
    public static void main(String[] args){
        java.util.HashSet hs = new java.util.HashSet (  );
        hs.add("sdsfa");
        java.util.List < String> al=new java.util.ArrayList < String> ();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add ( "3");
        al.add(Integer.toString(90));


        java.util.List < String> al2=new java.util.LinkedList < String> ();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);
    }
}
