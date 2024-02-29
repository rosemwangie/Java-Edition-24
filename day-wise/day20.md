## 17/02
# 4.4 Static Fields and Methods

## 4.4.1 Static Fields
- **Definition**: Static fields, also known as class variables, are shared among all instances of a class.
- **Usage**: They are used for values that are common to all objects of a class (e.g., a counter of the number of objects created).
- **Syntax**: Declared with the `static` keyword. 

  ```java
  public static int counter;
  ```
## 4.4.2 Static Constants

- **Definition**: Static constants are static fields whose values cannot be changed once assigned.
- **Usage**: Often used for fixed values that are relevant to all instances of a class, such as mathematical constants or configuration values.
- **Syntax**: Declared with static final keywords.

```java
public static final double PI = 3.14159;
```
## 4.4.3 Static Methods

- **Definition**: Methods that can be called on the class itself rather than on instances of the class.
- **Usage**: Useful for operations that don't require data from an instance of the class.
- **Example**: Math.pow(x, y) is a static method that computes the value of x raised to the power of y.
- **Syntax**: Declared with the static keyword.

```java
public static void methodName() {
    // code
}
```
