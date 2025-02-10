package CoreJavaPractices.src.OOPS.Polymorphism;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class HappyNumberFilter extends AbstractNumberFilter {
    public HappyNumberFilter(int start, int end) {
        super(start, end);
    }

    @Override
    public List <Integer> filter() {
        return java.util.stream.IntStream.rangeClosed(startElement, endElement)
                .filter(this::isHappy)
                .boxed()
                .collect( Collectors.toList());
    }

    private boolean isHappy(int num) {
        Set <Integer> seen = new HashSet <> ();
        while (num != 1 && seen.add(num)) {
            num = getSquareSum(num);
        }
        return num == 1;
    }

    private int getSquareSum(int num) {
        return String.valueOf(num).chars()
                .map(c -> (c - '0') * (c - '0'))
                .sum();
    }
}
