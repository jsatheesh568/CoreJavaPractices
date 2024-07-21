package src;
class demo{
    public void show(){
        System.out.println("This is show method inside demo");
    }
}
class ClassNameExample{
    public static void main(String[] args){
       demo demo = new src.demo ();
        //ClassNameExample demo = new src.ClassNameExample ();
        demo.show ();
    }
}
