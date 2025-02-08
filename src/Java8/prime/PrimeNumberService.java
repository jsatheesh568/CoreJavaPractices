package CoreJavaPractices.src.Java8.prime;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberService {
    public String generatePrimes(int count) {
        return IntStream.iterate(2, n -> n + 1)
                .filter(PrimeNumberUtil::isPrime)
                .limit(count)
                .mapToObj(String::valueOf)
                .collect( Collectors.joining(","));
    }
}
