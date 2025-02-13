package src.SOLIDPrinciples.Interfacesegregation;

import src.SOLIDPrinciples.Interfacesegregation.Scanner;

public class MultiFunctionPrinter implements src.SOLIDPrinciples.Interfacesegregation.Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
}