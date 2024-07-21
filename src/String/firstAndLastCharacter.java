package src.String;

public class firstAndLastCharacter {
    public static void main(String[] args){
         String str = "Tata Consultancy Services,Belgium";
         firstAndLastCharacter(str);
    }

    public static void firstAndLastCharacter(String str){
        int n = str.length ();
        char first = str.charAt ( 0 );
        char last = str.charAt ( n-1 );
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
