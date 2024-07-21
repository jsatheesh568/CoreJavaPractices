package src.OOPS.interfaces;
@FunctionalInterface
interface I1{
    public void showName();
}
interface I2 extends I1{
    public void showName();
    public void showName2();
}
public class InterfaceDemo implements I1,I2{
    public static void main(String[] args){
        InterfaceDemo interfaceDemo = new src.OOPS.interfaces.InterfaceDemo ();
        interfaceDemo.showName ();
        interfaceDemo.showName2 ();

    }

    @Override
    public void showName ( ) {
System.out.println ( "This is I1 show name" );
    }

    @Override
    public void showName2 ( ) {
        System.out.println ( "This is I2 show name 2" );
    }
}
