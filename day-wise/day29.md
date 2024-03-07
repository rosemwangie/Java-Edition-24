## 25/02

# 4.7 Records
Records in Java are a special kind of class that is concise and easy to use for data carrying objects. They are particularly useful for classes that are meant to aggregate a small amount of data and don't need to modify it - essentially, data transfer objects (DTOs).

## 4.7.1 The Record Concept
- A record is a final class that automatically implements equals(), hashCode(), and toString() based on the whole state of the record. The state is defined by the record's components, which are the fields specified in the record's declaration.
- Records are a special type of class in Java introduced in Java 16. 
- They are a quick way of creating data-carrying classes without having to write boilerplate code.



```java
//Example 1
public record User(String name, int age) {}

// Example 2
public record Book(String title, String author) {}

```
> [!NOTE]
> This single line of code declares a record with two components: title and author. Java automatically generates a public constructor, along with equals(), hashCode(), and toString() methods that consider both title and author in their computations.e

## 4.7.2 Constructors: Canonical, Custom, and Compact
- Records support different types of constructors to initialize their state.

- **Canonical Constructor**: Automatically provided by Java for records, which takes all fields as parameters.
```java
public record Book(String title, String author) {}
// The canonical constructor is Book(String title, String author)

```

- **Custom Constructor**: You can define your own constructor to validate parameters or perform additional actions.

```java
public record Book(String title, String author) {
    public Book {
        if (title == null || author == null) {
            throw new IllegalArgumentException("title and author must not be null");
        }
        this.title = title.trim(); // Normalize data by trimming whitespace
        this.author = author.trim();
    }
}

```

- **Compact Constructor**: A constructor without parameters list, used in records to validate or process fields without repeating parameter names.

```java
public record Book(String title, String author) {
    public Book {
        // Parameters title and author are implicitly declared
        if (title == null || author == null) {
            throw new IllegalArgumentException("title and author must not be null");
        }
        title = title.trim(); // Directly modify the implicit parameters
        author = author.trim();
    }
}

```

```java
public record Employee(String name, int id) {
    // Custom Constructor
    public Employee {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive.");
    }
}
```