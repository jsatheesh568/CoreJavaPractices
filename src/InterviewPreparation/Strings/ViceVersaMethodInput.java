package CoreJavaPractices.src.InterviewPreparation.Strings;

// create a function which takes input as 8 and returns 11 and viceversa but without using
// conditional if else
public class ViceVersaMethodInput {
  public static int testData(int n) {
    return 8 + 11 - n;
  }

  // Input is 8 :11
  // Input is 11 :8

  public static void main(String[] args) {
    System.out.println("Input is 8 :" + testData(8));
    System.out.println("Input is 11 :" + testData(11));
  }
}
