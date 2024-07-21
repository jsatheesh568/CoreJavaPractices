package src.String;

public class ReverseString {
    public static void main(String[] args){
        String original = "Tata Consultancy Services, Brussels";
        String reversed = reverseWithStreams(original);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseWithStreams(String str) {
        return str.chars()
                .mapToObj(c -> (char)c)
                .collect( java.util.stream.Collectors.collectingAndThen( java.util.stream.Collectors.toList(), list -> {
                    java.util.Collections.reverse(list);
                    return list.stream();
                }))
                .map(Object::toString)
                .collect( java.util.stream.Collectors.joining());
    }
}
