package src.OOPS.Abstraction;

abstract class Student {
  public String name;

  abstract void calculate(double m1, double m2);

  public void display(String name) {
    System.out.println("Student Details " + name);
  }
}

public class AbstractionDemo extends Student {
  public static void main(String[] args) {
    Student stu = new src.OOPS.Abstraction.AbstractionDemo();
    stu.display("Satheesh");
    stu.calculate(98, 89);
  }

  @Override
  void calculate(double m1, double m2) {
    double totalMarks = m1 + m2;
    System.out.println("Total marks : " + totalMarks);
  }
}
