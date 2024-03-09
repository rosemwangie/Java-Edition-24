## 18/02

## 4.4.4 Factory Methods

- **Definition**: Special static methods that are used to create and return instances of a class.
- **Purpose**: Provides a way to control the creation process of objects, potentially returning different subclasses or cached objects based on the input.
- **Example**: valueOf or getInstance methods in wrapper classes like Integer or in classes like Calendar.

```java
public static ClassName getInstance() {
    // create and return an instance of ClassName
}
```
## 4.4.5 The main Method

- **Role**: The entry point for Java applications.
- **Characteristics**: It must be public, static, have a return type of void, and accept a single argument: an array of String objects.
Syntax:

```java
public static void main(String[] args) {
    // code to be executed
}
```
