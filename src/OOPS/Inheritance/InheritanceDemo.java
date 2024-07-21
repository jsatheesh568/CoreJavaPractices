package src.OOPS.Inheritance;

interface A {
  default void display() {
    System.out.println("This is Interface A default Method");
  }
}

interface B extends A{
    default void display(){
       // A.super.display ();     // o/p:  This is Interface A default Method
        System.out.println ( "This is Interface B default method" );
    }
}
public class InheritanceDemo implements  A,B{
  /*  @Override
    public void display(){                 // o/p:  This is InheritanceDemo display ()
        System.out.println("This is InheritanceDemo display ()");
    }*/
    public static void main(String[] args){
        InheritanceDemo inheritanceDemo = new src.OOPS.Inheritance.InheritanceDemo ();
        inheritanceDemo.display ();
    }
}
