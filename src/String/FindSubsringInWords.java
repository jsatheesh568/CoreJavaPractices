package CoreJavaPractices.src.String;

public class FindSubsringInWords {
  public static void main(String[] args) {
    String[] findString = {"Tata", "Tata Steel", "Tata Consumer", "Titan"};
    String search = "Tata";
    for (String getString : findString) {
      if (getString.contains(search)) {
        System.out.println(getString); // o.p : Tata   Tata Steel  Tata Consumer
      }
    }
  }
}
