package CoreJavaPractices.src.InterviewPreparation.Strings;

public class ReverseNumber {
    public static void main(String[] args){
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
        //Reversed Number: 54321
    }

    private static int reverseNumber ( int number ) {
        return Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}
