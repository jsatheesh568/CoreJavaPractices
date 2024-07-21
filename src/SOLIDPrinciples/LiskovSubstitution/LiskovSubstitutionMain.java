package src.SOLIDPrinciples.LiskovSubstitution;

// Definition: Subtypes must be substitutable for their base types without altering the correctness of the program.
/*
    * Ensure that derived classes extend the base class without changing its behavior.
    * Avoid violating the expectations established by the base class.
 */
public class LiskovSubstitutionMain {
    public static void main(String[] args){
        Bird sparrow = new Sparrow();
        sparrow.fly();

        Bird ostrich = new Ostrich();
        try {
            ostrich.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
