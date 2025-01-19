package CoreJavaPractices.src.InterviewPreparation.Strings;

import java.util.Arrays;

public class WordCount {
    public static void main(String[] args){
        String input = "Tech Mahindra, Infosys, HCL Technologies, Tata Consultancy services";
        long wordCount = countWords(input);
        System.out.println("Word Count: " + wordCount);
        //Word Count: 8
    }

    private static long countWords ( String input ) {
        return Arrays.stream(input.split("\\s+"))
                .filter (word -> !word.trim().isEmpty())
                .count();
    }
}
