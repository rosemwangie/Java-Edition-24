## 26/02


# 4.6 Object Construction

## 4.6.1 Overloading
Method overloading allows a class to have more than one constructor with different parameter lists. Each constructor can initialize objects in different ways.


```java
public class Employee {
    Employee() {
        // default constructor
    }

    Employee(String name) {
        // constructor with one parameter
    }

    Employee(int age int year) {
        // constructor with one parameter
    }
}
```

## 4.6.2 Default Field Initialization
When a class is instantiated, class fields are automatically initialized with default values (0 for numeric types, false for boolean, null for object references) unless explicitly initialized.

```java
public class Rectangle {
    private int length = 20; // Explicit initialization
    private int width; // width will be initialized to 0 by default
    private int name; // null
    private boolean isTrue; // false

}
```
## 4.6.3 The Constructor with No Arguments
A constructor without arguments is called a no-argument constructor. It's often used to initialize objects with default values.

```java
public class Book {
    Book() {
        // no-argument constructor
    }
}
```