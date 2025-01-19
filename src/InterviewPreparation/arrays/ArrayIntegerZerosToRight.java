package CoreJavaPractices.src.InterviewPreparation.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayIntegerZerosToRight {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3, 6, 2, -1, 0, 3, 0, 5, 0, -3, 0, 0);
        List<Integer> rearrangedList = moveZerosToRight(numbers);
        System.out.println("Rearranged List: " + rearrangedList);
        //Rearranged List: [3, 6, 2, -1, 3, 5, -3, 0, 0, 0, 0, 0]
    }

    private static List<Integer> moveZerosToRight ( List<Integer> numbers ) {
        List <Integer> nonZeros = numbers.stream()
                .filter(num -> num != 0)
                .collect(Collectors.toList());
        List<Integer> zeros = numbers.stream()
                .filter(num -> num == 0)
                .collect( Collectors.toList());
        nonZeros.addAll(zeros);
        return nonZeros;
    }
}
