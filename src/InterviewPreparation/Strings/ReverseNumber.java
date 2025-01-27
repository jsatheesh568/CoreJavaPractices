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

/*   // Reverse the number without using inbuilt function.
 private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }
        return reversed;
    }*/
}
