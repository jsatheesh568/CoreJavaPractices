package CoreJavaPractices.src;

/*
Copies only references, not the actual objects.
Changes in the cloned object's reference type fields reflect in the original object.
Uses super.clone() for copying.
Faster but may lead to unintended modifications
 */
class Address1 {
  String city;

  Address1(String city) {
    this.city = city;
  }
}

class ShallowCopyExample implements Cloneable {
  String name;
  Address1 address;

  ShallowCopyExample(String name, Address1 address) {
    this.name = name;
    this.address = address;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone(); // Shallow copy
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Address1 addr = new Address1("New York");
    ShallowCopyExample person1 = new ShallowCopyExample("John", addr);

    // Creating a shallow copy
    ShallowCopyExample person2 = (ShallowCopyExample) person1.clone();

    // Changing cloned object's address
    person2.address.city = "Los Angeles";

    // Output results
    System.out.println("Person 1 Address: " + person1.address.city); // Output: Los Angeles
    System.out.println("Person 2 Address: " + person2.address.city); // Output: Los Angeles
  }
}
