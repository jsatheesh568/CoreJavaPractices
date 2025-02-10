package CoreJavaPractices.src.OOPS.Polymorphism;

import java.util.List;
import java.util.stream.Collectors;

class PrimeNumberFilter extends AbstractNumberFilter {
    public PrimeNumberFilter(int start, int end) {
        super(start, end);
    }

    @Override
    public List <Integer> filter() {
        return java.util.stream.IntStream.rangeClosed(startElement, endElement)
                .filter(this::isPrime)
                .boxed()
                .collect( Collectors.toList());
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        return java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .allMatch(divisor -> num % divisor != 0);
    }
}

