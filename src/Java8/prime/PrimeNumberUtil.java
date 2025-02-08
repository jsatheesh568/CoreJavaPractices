package CoreJavaPractices.src.Java8.prime;

import java.util.stream.IntStream;

public class PrimeNumberUtil {
    private PrimeNumberUtil() { }

    public static boolean isPrime(int num) {
        return num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .allMatch(i -> num % i != 0);
    }
}
