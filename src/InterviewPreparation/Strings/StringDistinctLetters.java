package CoreJavaPractices.src.InterviewPreparation.Strings;

import java.util.Set;
import java.util.stream.Collectors;

public class StringDistinctLetters {
    public static void main(String[] args){
        String paragraph = "Java is fun! Java 8 streams are powerful.";
        Set <Character> distinctLetters = findDistinctLetters(paragraph);
        System.out.println("Distinct Letters: " + distinctLetters);
        //Distinct Letters: [a, e, f, i, j, l, m, n, o, p, r, s, t, u, v, w]
    }

    private static Set< Character> findDistinctLetters ( String paragraph ) {
        return paragraph.chars()
                .filter(Character::isLetter)
                .mapToObj(ch -> Character.toLowerCase((char) ch))
                .collect( Collectors.toSet());
    }
}
