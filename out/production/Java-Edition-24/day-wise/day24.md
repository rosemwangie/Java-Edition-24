## 21/02


## 4.6.4 Explicit Field Initialization

Fields can be directly initialized in their declaration. This initialization happens before any constructor is executed.


```java
public class Circle {
    private double radius = 1.0;
}
```

## 4.6.5 Parameter Names
In constructors, parameter names should be clear and indicate their purpose. Often, they have the same name as the fields they initialize, requiring the use of this to distinguish them.


```java
public class Person {
    private String name;

    Person(String name) {
        this.name = name; // Use of "this" to refer to the instance variable
    }
}
```

## 4.6.6 Calling Another Constructor
Within a constructor, you can call another constructor of the same class using this() with the appropriate arguments.


```java
public class Account {
    Account() {
        this(0); // Calls the constructor with one int argument
    }

    Account(int balance) {
        // Code to initialize account with balance
    }
}
```

## 4.6.7 Initialization Blocks
Initialization blocks are code blocks that are executed before any constructor. They can be used to initialize common parts of various constructors.


```java
public class Vehicle {
    {
        // Initialization block
        System.out.println("Initialization block executed");
    }
}
```

## 4.6.8 Object Destruction and the finalize Method

The finalize method is called by the garbage collector before an object is destroyed. It's typically used to release resources or perform cleanup activities.

```java
protected void finalize() {
    // Code to cleanup before object is destroyed
}
```