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

