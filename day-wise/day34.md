## 01/03

# 5: Inheritance
Inheritance - is a mechanism that allows one class to inherit the properties and behaviors (fields and methods) of another class.

The class that is inherited from is called the superclass or parent class, and the class that inherits is called the subclass or child class.

### Importance of Inheritance
* It promotes code reusability and helps create a hierarchy of class
* It also helps create a hierarchy of classes

The subclass can use and extend the functionality of the superclass, inheriting its attributes and methods. This relationship establishes an "is-a" connection between the two classes.

## 5.1 Classes, Superclasses, and Subclasses
## Classes
* A class is a blueprint or a template for creating objects in object-oriented programming.
* It defines the properties (attributes or fields) and behaviors (methods) that objects created from the class will have.
* Classes are used to model real-world entities and encapsulate their characteristics and actions.

## Superclass
* A superclass, also known as a parent class or base class, is a class that is extended or inherited by another class.
* It provides a common set of attributes and methods that are shared by one or more subclasses.
* The superclass serves as a generalized representation, and its features can be reused by its subclasses.

## Sublass(Child CLass)
* A subclass, also known as a child class or derived class, is a class that inherits attributes and methods from a superclass.
* It extends or specializes the functionality of the superclass by adding new attributes or methods or by overriding existing ones.
* The subclass is more specific and can have additional features beyond what is inherited from the superclass.

# NOTE
* Inheritance allows for the creation of a hierarchy of classes, where subclasses can inherit and build upon the properties and behaviors of their superclasses. 

## Code snippet illustration
```java
// Superclass
class Vehicle {
    String brand;

    void start() {
        System.out.println("Starting the vehicle.");
    }
}

// Subclass 1
class Car extends Vehicle {
    int numberOfDoors;

    void drive() {
        System.out.println("Driving the car.");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    boolean hasSideCar;

    void ride() {
        System.out.println("Riding the motorcycle.");
    }
}
```

### 5.1.1 Defining Subclasses
In Java, we define a subclass using the extends keyword in the class declaration. The extends keyword indicates that the class being declared is a subclass of another class (the superclass). Here's the basic syntax:

```java
class Subclass extends Superclass {
    // Subclass members
}
```
In this syntax:

* Subclass: This is the name of the subclass you are defining.
* Superclass: This is the name of the class that the subclass is extending or inheriting from.

Below is code snippet
```java
// Superclass
class Vehicle {
    String brand;

    void start() {
        System.out.println("Starting the vehicle.");
    }
}

// Subclass
class Car extends Vehicle {
    int numberOfDoors;

    void drive() {
        System.out.println("Driving the car.");
    }
}
```

In this case, Car is the subclass, and it extends the Vehicle superclass. The Car class inherits the brand property and the start method from the Vehicle class, and it also has its own additional property (numberOfDoors) and method (drive).
* When you create an instance of the Car class, it will have both the characteristics of a general vehicle and the specific features of a car. This inheritance relationship allows for code reuse and the creation of a hierarchy of classes.
### 5.1.2 Overriding Methods 
Method overriding refers to the ability of a subclass to provide a specific implementation for a method that is already defined in its superclass.
* When a subclass provides its own implementation for a method that is already present in the superclass, it is said to override that method.

## Key points bout method overriding:
* Same Method Signature:

The overriding method in the subclass must have the same method signature (name, return type, and parameters) as the method in the superclass.
* Access Modifiers:

The access modifier of the overriding method in the subclass should not be more restrictive than the access modifier of the overridden method in the superclass. For example, if a method in the superclass is declared as public, the overriding method in the subclass can be public but not private.
* Return Type:

The return type of the overriding method must be the same as, or a subtype of, the return type of the overridden method. This concept is known as covariant return types and applies to Java 5 and later.
* Override Annotation (Optional):

While not strictly required, it's a good practice to use the @Override annotation when overriding a method. This annotation helps catch errors at compile-time if the method is not correctly overridden.

Below is a code snippet:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}

class Dog extends Animal {
    // Override the makeSound method in the subclass
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}
```

* In this example, the Dog class is a subclass of Animal, and it overrides the makeSound method. When you create an instance of Dog and call the makeSound method, it will execute the specific implementation provided in the Dog class, not the generic one from the Animal class.

```java
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();  // Output: Dog barks.
    }
}
```
Method overriding allows for polymorphism, where you can treat objects of the subclass as objects of the superclass, and the appropriate method implementation is called dynamically based on the actual type of the object at runtime.

### 5.1.3 Subclass Constructors 
These are constructors defined within a subclass in Java. 
* When you create an instance of a subclass, Java automatically invokes its constructor to initialize the subclass object.
* In Java, when a subclass is instantiated, its constructor is responsible for initializing both the attributes inherited from the superclass and any additional attributes defined within the subclass.

Below is code snippet: 
```java
// Superclass representing a geometric shape
class Shape {
    String color;

    // Constructor for Shape
    Shape(String color) {
        this.color = color;
    }

    // Method to calculate area (placeholder implementation)
    double calculateArea() {
        return 0.0;
    }
}

// Subclass representing a rectangle
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor for Rectangle
    Rectangle(String color, double length, double width) {
        // Call superclass constructor using 'super'
        super(color);
        this.length = length;
        this.width = width;
    }

    // Override calculateArea method to calculate area of rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle myRectangle = new Rectangle("Blue", 5.0, 3.0);
        
        // Access attributes inherited from Shape
        System.out.println("Color: " + myRectangle.color);
        
        // Access attributes specific to Rectangle
        System.out.println("Length: " + myRectangle.length);
        System.out.println("Width: " + myRectangle.width);
        
        // Calculate and print area of the rectangle
        System.out.println("Area: " + myRectangle.calculateArea());
    }
}
```
In this example:

* The Shape class represents a geometric shape and has a constructor that initializes the color attribute.
* The Rectangle class extends Shape and adds additional attributes length and width to represent a rectangle.
* The Rectangle class constructor initializes both color (inherited from Shape) and length and width.
* The super(color) statement in the Rectangle constructor calls the constructor of the superclass
* Shape to initialize the color attribute.
The calculateArea method is overridden in the Rectangle class to calculate the area specific to a rectangle.

### 5.1.4 Inheritance Hierarchies 
This refers to the organization of classes in an object-oriented programming language where subclasses inherit from superclasses, forming a hierarchical structure.
* At the top of the hierarchy, you often find a more general or abstract class (the superclass), which is then extended by more specialized classes (subclasses) further down the hierarchy.

Below is a code snippet:
```java
// Superclass representing a vehicle
class Vehicle {
    // Vehicle properties and methods
}

// Subclass representing a car, which is a type of vehicle
class Car extends Vehicle {
    // Car-specific properties and methods
}

// Subclass representing a truck, which is also a type of vehicle
class Truck extends Vehicle {
    // Truck-specific properties and methods
}

// Subclass representing a sedan, which is a type of car
class Sedan extends Car {
    // Sedan-specific properties and methods
}

// Subclass representing a SUV, which is also a type of car
class SUV extends Car {
    // SUV-specific properties and methods
}
```
In this hierarchy:

* Vehicle is the superclass, representing a general concept of a vehicle.
* Car and Truck are subclasses of Vehicle, representing more specific types of vehicles.
* Sedan and SUV are subclasses of Car, representing even more specialized types of vehicles.

### Types of Inheritance
Inheritance in object-oriented programming can be classified into various types based on the relationship between the superclass and the subclass. 

1. Single Inheritance:

* In single inheritance, a subclass inherits from only one superclass.
* For example, in Java, a class can extend only one other class.

```java
class A {
    // A is the superclass
}

class B extends A {
    // B is the subclass
}
```
2. Multiple Inheritance:
* Multiple inheritance allows a subclass to inherit from more than one superclass.
* While it provides flexibility, it can lead to complications known as the "diamond problem" where the same method or attribute is inherited from multiple paths.
* Some programming languages, like Java, don't support multiple inheritance for classes, but they do allow it for interfaces.

```java
interface A {
    // Interface A
}

interface B {
    // Interface B
}

class C implements A, B {
    // C implements both interfaces A and B
}
```

3. Multilevel  Inheritance (or Hierarchical Inheritance):
* In multilevel inheritance, a class acts as both a superclass and a subclass in a chain of inheritance.
* Each subclass inherits from its immediate superclass, forming a hierarchy.

```java
class A {
    // A is the superclass
}

class B extends A {
    // B is a subclass of A
}

class C extends B {
    // C is a subclass of B, and indirectly, a subclass of A
}
```
4. Hierarchical inhertance
* In hierarchical inheritance, multiple subclasses inherit from a single superclass.
* This creates a tree-like structure with a common base class.
```java
class Animal {
    // Animal is the superclass
}

class Dog extends Animal {
    // Dog is a subclass of Animal
}

class Cat extends Animal {
    // Cat is a subclass of Animal
}
```

5. Hybrid (Mixed) Inheritance:
* Hybrid inheritance is a combination of two or more types of inheritance within a program.
* It can involve any combination of single, multiple, multilevel, or hierarchical inheritance.
```java
// Example combining single, multiple, and multilevel inheritance
class A {
    // A is the superclass
}

interface B {
    // B is an interface
}

class C extends A implements B {
    // C is a subclass of A and implements B
}
```

## NOTE
The choice of inheritance type depends on the specific requirements and design considerations of a particular programming scenario. Each type has its advantages and potential challenges, and it's essential to choose the appropriate type based on the problem at hand.