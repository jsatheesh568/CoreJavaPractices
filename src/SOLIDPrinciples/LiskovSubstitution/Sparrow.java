package src.SOLIDPrinciples.LiskovSubstitution;

public class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}