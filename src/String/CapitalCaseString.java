package src.String;

public class CapitalCaseString {
    public static void main(String[] args){
        // input string
        String input = "tata consultancy services chennai";

        // call the capitalizeWords function and store the result
        String result = capitalizeWords(input);

        // print the original and modified strings
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);

    // Input: tata consultancy services chennai
    // Output: Tata Consultancy Services Chennai
  }

    public static String capitalizeWords(String input) {
        // split the input string into an array of words, stream the array
        // apply the capitalization transformation and join the words back
        return java.util.Arrays.stream(input.split("\\s"))
                .map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1))
                .collect( java.util.stream.Collectors.joining(" "));
    }
}
