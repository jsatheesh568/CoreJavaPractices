package CoreJavaPractices.src.InterviewPreparation.Strings;

public class LetterCount {
    public static void main(String[] args){
        String input = "Hello World Crypto18!";
        long letterCount = countLetters(input);
        System.out.println("Letter Count: " + letterCount);
        //Letter Count: 16
    }

    private static long countLetters ( String input ) {
        return  input.chars()
                .filter(Character::isLetter)
                .count();
    }
}
