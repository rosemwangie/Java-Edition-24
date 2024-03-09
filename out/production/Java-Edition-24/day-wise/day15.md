## 12/02

## 4.3.4 First Steps with Constructors

Constructors in Java are special methods used to initialize new objects. They are called when an instance of a class is created and have the same name as the class. Constructors can take arguments to initialize the object's attributes with specific values.

Example:
```java
 
public class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}


// Creating an instance of Book
Book myBook = new Book("Core Java", "Cay S. Horstmann");

```
> [!NOTE]
> This constructor allows the creation of a Book object with a title and an author. The this keyword refers to the current object instance.

## 4.3.5 Declaring Local Variables with var

- Java 10 introduced the var keyword, allowing you to declare local variables without specifying their type. The type is inferred by the compiler based on the variable's initial value. This feature simplifies code and can make it more readable, especially when dealing with complex generic types.

Example:

```java
 
var message = "Hello, Java 10!"; // The compiler infers String
var list = new ArrayList<String>(); // The compiler infers 
ArrayList<String>
```

> [!NOTE]
> Note that var can only be used for local variables inside methods or code blocks and cannot be used for class fields, parameters, or return types.

## 4.3.6 Working with null References

In Java, null is a special value that can be assigned to any reference type and indicates that the variable does not refer to any object. However, dereferencing a null variable (i.e., accessing a method or property on it) will throw a NullPointerException.

Java 8 introduced the Optional class to better handle cases where a value might be null, providing a more functional-style approach to avoid NullPointerException.

Example without Optional:
java
 
public String getBookTitle(Book book) {
    if (book != null) {
        return book.getTitle();
    } else {
        return "No title";
    }
}
Example with Optional:
java
 
public String getBookTitle(Optional<Book> book) {
    return book.map(Book::getTitle).orElse("No title");
}
Using Optional, you can express the possibility of a variable being null more explicitly and perform operations like map, flatMap, and orElse to handle values safely without explicit null checks.

#