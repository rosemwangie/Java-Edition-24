## 11/02

## Summary: Defining Your Own Classes in Java

## 4.3 Defining Your Own Classes

Delving into how to define custom classes in Java, focusing on the essential components that constitute a class.

Some of the key components; 
Fields: Variables that store the state of an object.
Methods: Functions that operate on the object's state and behavior.
Constructors: Special methods used to initialize new objects.

## 4.3.1 An Employee Class

This subsection uses an Employee class to illustrate class definition practically.

Class Structure:
- Fields: name, salary, hireDay.
- Methods: Includes getters, setters, and a method to raise an employee's salary.
- Constructor: Initializes the object with name, salary, and hire date.

Snippet: Employee Class Definition

```java
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    // Getter and setter methods
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public LocalDate getHireDay() { return hireDay; }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

```

## 4.3.2 Use of Multiple Source Files

Discusses organizing a Java program across multiple source files for better maintainability and readability.

**Advantages:**
- Facilitates code organization.
- Enhances maintainability.

**Splitting Classes**
While this section is more conceptual, involving multiple source files doesn't directly lend itself to a single code snippet. 
Instead, it suggests structuring your project so each class is in its own .java file, 

For example:

<i>Employee.java</i> <br>
<i>Main.java</i>


## 4.3.3 Dissecting the Employee Class

Provides a detailed examination of the Employee class' components.

- Fields Explained: Discusses private access modifiers for encapsulation.
- Method Insights: Detailed look at method implementation and its impact on object state.
- Code Snippet: Constructor Overloading and Method Detail

```java

// Overloaded Constructor
public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    this.hireDay = LocalDate.now(); // Default to current date
}

// Detailed method example
public void raiseSalary(double byPercent) {
    double raise = this.salary * byPercent / 100;
    this.salary += raise;
}
```
- Constructor Overloading: Shows how to provide multiple constructors for flexibility in object creation.
- Immutable classes: Discussion on making classes immutable with final fields.
- Use of final keyword with methods to prevent overriding.