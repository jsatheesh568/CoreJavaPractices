package CoreJavaPractices.src.java17;


/*
Sealed classes and interfaces were introduced in Java 17 to control which classes or interfaces can extend or implement them. This feature allows developers to restrict inheritance, providing better control over class hierarchies.

Why Use Sealed Classes and Interfaces?

To restrict which classes can extend a superclass.
To provide a controlled hierarchy.
To improve security and maintainability.
Helps the compiler optimize pattern matching and reduce unexpected subclassing.

Rules for Sealed Classes
========================
A sealed class must specify permitted subclasses using the permits keyword.

All permitted subclasses must directly extend the sealed class.

Permitted subclasses must specify their inheritance behavior using:
final → Cannot be extended further.
sealed → Can be extended but only by specified subclasses.
non-sealed → Open for any class to extend.

 */
sealed class Animal permits Dog, Cat {
  void sound() {
    System.out.println("Animal makes a sound");
  }
}

final class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks");
  }
}

final class Cat extends Animal {
  void meow() {
    System.out.println("Cat meows");
  }
}

public class SealedClassExample {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myDog.sound(); // Animal makes a sound
    ((Dog) myDog).bark(); // Dog barks

    myCat.sound(); // Animal makes a sound
    ((Cat) myCat).meow(); // Cat meows
  }
}
