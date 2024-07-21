package src.String;

public class VariableDemo {
    static int a= 10;
    public void display(){
        int a =20;
    System.out.println(a);
    }

}
class emp extends VariableDemo{
    public static void main(String[] args){
        emp e = new src.String.emp ();
        e.display ();
    System.out.println(a);
    }
}