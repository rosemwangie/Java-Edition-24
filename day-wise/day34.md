## 01/03

# 5: Inheritance

Inheritance is a process where one class acquires the properties of another class. These properties include methods and/or attributes

The class which inherits the properties of other is known as subclass,derived class or child class.

The class whose properties are inherited is known as superclass ,base class or parent class.



### Why Java Inheritance? Why do we need it?? 


1. **For Code Reusability**

The basic need of an inheritance is to reuse the features. If you have defined some functionality once, by using the inheritance you can easily use them in other classes and packages.

2. **Extensibility**
It helps extend the functionalities of a class

3. **Method Overriding**
Inheritance is required to achieve one of the concepts of Polymorphism which is Method overriding.

> It's the kind of programming that focuses on `Objects`

In Java:
- A new class can inherit `methods` and `characteristics` (fields) from an existing class
- This allows you to reuse what's already been created without writing again.
- You can also add new features and abilities to the new class to make it unique.

![Screenshot 2024-03-09 at 14.12.11.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fdj%2Fxrbnzv2d7x383pvh43znjzy00000gp%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_kdpHo2%2FScreenshot%202024-03-09%20at%2014.12.11.png)

### Explanation of the snippet above
- Superclass(Animal):
    - Has a field `type` that signifies the type of the animal.
    - Includes a method `eat()` that prints a general statement about eating.
-  Subclass(Dog):
    - Uses `extends` keyword to inherit from `Animal`.
    - Adds its own field `name` to give a specific name of the dog.
    - Includes a constructor to initialize `name` when a new `Dog` object is created.
    - Contains an additional method `display` to print the dog's name and type.
- Using inheritance
    - The `Dog` class inherits the `eat()` method from the `Animal` class. When `myDog.eat()` is called, it shows that `Dog` can use the `eat` method of `Animal`.
    - The `Dog` class adds its own behavior with the `display()` method, showcasing how subclasses can extend superclass functionality.


## 5.1 Classes, Superclasses, and Subclasses

The class which inherits the properties of other is known as subclass,derived class or child class.
The class whose properties are inherited is known as superclass ,base class or parent class.



### Implement Java Inheritance 

To implement (use) inheritance in Java, the *extends* keyword is used. It inherits the properties (attributes or/and methods) of the super class to the derived class. 


Here is a snippet


```

class Super { ..... 

..... } 


class Sub extends Super { .....

..... }

```


When an object to **MyCalculation** class is created, a copy of the contents of the superclass (**Calculation { }**) is made within it.


The Superclass reference variable can hold the subclass object, but using that variable you can access only the members of the superclass, so to access the members of both classes it is recommended to always create reference variable to the subclass.




### 5.1.1 Defining Subclasses


Below is how you define a Subclass,child classor derived class

```

public class Manager extends Employee {

    added methods and fields
}

```

The Keyword extends shows that you are making a new class  that derives from an exosting class(Parent/Super)

**Note** − A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass


### Example  Code to demonstrate Inheritance



```java
class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

public class MyCalculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation calc = new MyCalculation();
        calc.addition(a, b);
        calc.Subtraction(a, b);
        calc.multiplication(a, b);
    }
}



```


The code demonstrates inheritance in Java, where the `MyCalculation` class extends the `Calculation` class. This means that `MyCalculation` inherits the methods and attributes of `Calculation`, allowing it to use the `addition` and `Subtraction` methods without redefining them. Additionally, `MyCalculation` adds a new method `multiplication`, showcasing how inheritance facilitates code reuse and extension.





### 5.1.2 Overriding Methods

If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.


Method overriding in Java is used for:

Provide the specific implementation of a method which is already provided by its superclass.

Used for Runtime Polymorphism.

### 5.1.3 Subclass Constructors 

In Java, subclass constructors are used to initialize the subclass's specific attributes or to customize the initialization process while also ensuring that the superclass's state is properly initialized. Here's an explanation with code:
```java
public class Employee {
    private String name;
    private double salary;
    private int year;
    private int month;
    private int day;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // Getters and setters
}

```
Now, let's create a subclass Manager which extends Employee:


```java

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }
    
    // Additional methods for Manager class
}
```



### 5.1.4 Inheritance Hierarchies 

In Java, there are mainly three types of inheritances Single, Multilevel, and Hierarchical. Java does not support Multiple and Hybrid inheritance.

 ### Java Single Inheritance 

 This type of inheritance has only one base class and one derived class. e.g
```java
 class  BaseClass{

    ..............
 }

 class DerivedClass extends BaseClass{



    .........................
 }

 ```



### Java Multilevel Inheritance

The inheritance in which a base class is inherited to a derived class and that derived class is further inherited to another derived class is known as multi-level inheritance. Multilevel inheritance involves multiple base classes.


```java
 class  BaseClass{

    ..............
 }

 class DerivedClass extends BaseClass{



    .........................
 }

 class NewDerivedClass extends DerivedClass{


    .........................
 }

 ```

 Java Hierarchical Inheritance

It describes the inheritance in which only one base class exists and multiple classes 
are derived from the single base class



```java
 class  BaseClass{

    ..............
 }

 class DerivedClass extends BaseClass{



    .........................
 }

 class NewDerivedClass extends BaseClass{


    .........................
 }

 ```










