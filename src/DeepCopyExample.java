package CoreJavaPractices.src;

/*
Creates completely new copies of referenced objects.
Changes in the cloned object's fields do not affect the original object.
Requires manually cloning mutable objects (e.g., using a copy constructor or overriding clone()).
Safer but slower due to extra object creation.
 */
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    // Deep copy constructor
    Address(Address address) {
        this.city = address.city;
    }
}

class DeepCopyExample implements Cloneable {
    String name;
    Address address;

    DeepCopyExample(String name, Address address) {
        this.name = name;
        this.address = new Address(address); // Deep Copy
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new DeepCopyExample(this.name, new Address(this.address)); // Cloning new Address object
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        DeepCopyExample person1 = new DeepCopyExample("John", addr);

        // Creating a deep copy
        DeepCopyExample person2 = (DeepCopyExample) person1.clone();

        // Changing cloned object's address
        person2.address.city = "Los Angeles";

        // Output results
        System.out.println("Person 1 Address: " + person1.address.city); // Output: New York
        System.out.println("Person 2 Address: " + person2.address.city); // Output: Los Angeles
    }
}

