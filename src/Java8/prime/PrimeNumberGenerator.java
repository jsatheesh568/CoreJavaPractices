package CoreJavaPractices.src.Java8.prime;


/*
1. Print 1 to 100 prime numbers using java 8 features.

Output: 2,3,5,7,11,13..97.

Note-Do it one line code
 */
public class PrimeNumberGenerator {
    public static void main(String[] args) {
        String primes = new PrimeNumberService().generatePrimes(100);
        System.out.println(primes);
    }
}
