package src.ScenarioBasedLearning;

public class CountCharacterAndWords {
    public static void main(String[] args){
        String companyName = "Tata Consultancy Services, Chennai";

        int totalCharacterCount = getTotalCharacterCount(companyName);
        long characterCountExcludingSpaces = getCharacterCountExcludingSpaces(companyName);
        long wordCount = getWordCount(companyName);
        java.util.Map < Character, Long> letterFrequency = getLetterFrequency(companyName);
        java.util.Map < Character, Long> characterFrequency = getCharacterFrequency(companyName);

        System.out.println("Total characters (including spaces): " + totalCharacterCount);
        System.out.println("Total characters (excluding spaces): " + characterCountExcludingSpaces);
        System.out.println("Total words: " + wordCount);
        System.out.println("Letter frequencies: " + letterFrequency);
        System.out.println("Character frequencies: " + characterFrequency);
    }

    // Method to get total character count including spaces
    private static int getTotalCharacterCount(String input) {
        return input.length();
    }

    // Method to get character count excluding spaces
    private static long getCharacterCountExcludingSpaces(String input) {
        return input.chars()
                .filter(c -> !Character.isWhitespace(c))
                .count();
    }

    // Method to get word count
    private static long getWordCount(String input) {
        return java.util.Arrays.stream(input.split("\\s+"))
                .count();
    }

    // Method to get frequency of each letter
    private static java.util.Map < Character, Long> getLetterFrequency( String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect( java.util.stream.Collectors.groupingBy( java.util.function.Function.identity(), java.util.stream.Collectors.counting()));
    }

    // Method to get frequency of each letter and spaces
    private static java.util.Map < Character, Long> getCharacterFrequency( String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect( java.util.stream.Collectors.groupingBy( java.util.function.Function.identity(), java.util.stream.Collectors.counting()));
    }
}
