package src.String;

public class firstAndLastWord {
    public static void main(String[] args){
        String str = "Tata Consultancy Services, Norway";
        java.util.List < String> words = java.util.Arrays.asList(str.split("\\s+"));

        // Find and print the first word
        words.stream().findFirst().ifPresent(firstWord -> System.out.println("First word: " + firstWord));

        // Find and print the last word
        words.stream().reduce((first, second) -> second).ifPresent(lastWord -> System.out.println("Last word: " + lastWord));
    }
}
