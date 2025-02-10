package CoreJavaPractices.src.OOPS.Polymorphism;

abstract class AbstractNumberFilter implements NumberFilter {
    protected final int startElement;
    protected final int endElement;

    public AbstractNumberFilter(int start, int end) {
        if (start > end || start < 0) {
            throw new IllegalArgumentException("Invalid range: start must be ≤ end and non-negative.");
        }
        this.startElement = start;
        this.endElement = end;
    }
}
