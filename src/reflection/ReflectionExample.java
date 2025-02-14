package CoreJavaPractices.src.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class Employee {
    private String name;
    private int age;

    public Employee() {}

    public void display() {
        System.out.println("Employee Details");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Get Class object
            Class<?> obj = Class.forName("CoreJavaPractices.src.reflection.Employee");

            // Get class name
            System.out.println("Class Name: " + obj.getName());

            // Get methods
            Method[] methods = obj.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
            }

            // Get fields
            Field[] fields = obj.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName());
            }

            // Get constructors
            Constructor<?>[] constructors = obj.getDeclaredConstructors();
            Class < ? > constructorCount = Employee.class;
            Constructor<?>[] countConstruct = constructorCount.getConstructors ();
            for (Constructor<?> constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName());
                System.out.println("Constructor count: " +countConstruct.length);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

