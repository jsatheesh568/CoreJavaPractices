package src.SOLIDPrinciples.Interfacesegregation;

// Definition: Clients should not be forced to depend on interfaces they do not use.
/*
    * Split large interfaces into smaller, more specific ones.
    * Ensure that implementing classes only need to implement methods they actually use.
 */
public class InterfaceSegregationMain {
  public static void main(String[] args) {
    src.SOLIDPrinciples.Interfacesegregation.Printer simplePrinter = (src.SOLIDPrinciples.Interfacesegregation.Printer) new src.SOLIDPrinciples.Interfacesegregation.SimplePrinter ();
    simplePrinter.print();

    src.SOLIDPrinciples.Interfacesegregation.MultiFunctionPrinter multiFunctionPrinter = new src.SOLIDPrinciples.Interfacesegregation.MultiFunctionPrinter ();
    multiFunctionPrinter.print();
    multiFunctionPrinter.scan();
  }
}
