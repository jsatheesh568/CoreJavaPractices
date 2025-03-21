package src.OOPS.Encapsulation;
class Employee{
    private String name;
    private String designation;

    public Employee ( ) {
        System.out.println ( "This is emp constructor" );
    }

    public Employee ( String name , String designation )  {
        this.name = name;
        this.designation = designation;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getDesignation ( ) {
        return designation;
    }

    public void setDesignation( String designation ) {
        this.designation = designation;
    }

    @Override
    public String toString ( ) {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
public class EncapDemo {
    public static void main(String[] args){
        Employee emp = new Employee (  );
        emp.setName ( "SATHEESH" );
        emp.setDesignation ( "Software Engineer" );
        emp.setName ( "Satheeshkumar" );
        System.out.println ( emp.toString ());
    }
}

