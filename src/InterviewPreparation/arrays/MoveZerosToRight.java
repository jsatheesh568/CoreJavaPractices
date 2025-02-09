package CoreJavaPractices.src.InterviewPreparation.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosToRight {
  public static void main(String[] args) {

    int[] arr = {3, -2, 4, 0, 6, 0, 2, -1, 0, 5, 0, 6, 0, 7, -9, 0};

    int[] result = moveZerosToRight(arr);

    System.out.println("Modified Array: " + Arrays.toString(result));

    //Modified Array: [3, -2, 4, 6, 2, -1, 5, 6, 7, -9, 0, 0, 0, 0, 0, 0]
  }

  public static int[] moveZerosToRight(int[] arr) {
    return IntStream.concat(
            Arrays.stream(arr).filter(num -> num != 0), // First, keep all non-zero elements
            Arrays.stream(arr).filter(num -> num == 0) // Then, append all zeroes
            )
        .toArray();
  }
}
