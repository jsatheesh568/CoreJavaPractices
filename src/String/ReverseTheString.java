package CoreJavaPractices.src.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheString {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args){
        String s1 = "Tata Consultancy Services, Chennai";
        String input = "Java Class";
        List <String> reversedWords = Arrays.stream(s1.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect( Collectors.toList());
        System.out.println(reversedWords);

        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

    }
}
