## 29/03

# 4.11 Class Design Hints

When designing classes in java, there are several best practices and principles to follow that can help you create more robust and reusable software components. Here are some key class design hints:

**1. Encapsulation: Keep Data Private**

Encapsulation is about hiding the internal state of an object and requiring all interaction to be performed through an object's methods. This protects the integrity of the data and makes the class easier to modify and maintain.

```java
public class Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent) {
        double increase = salary * byPercent / 100;
        salary += increase;
    }
}
```

**2. Define Constructors for Convenience**

Constructors should be defined to ensure that an object is always in a consistent state when it is created. Overloading constructors allows the creation of objects in different states, offering flexibility to the class users.

```java
public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
        this.salary = 0;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
```

**3. Favor Composition Over Inheritance**

Composition involves creating classes that reference other classes in their instance variables. It's often a better choice than inheritance because it's more flexible; you can change the composed class at runtime and it leads to less tight coupling between classes.

```java
public class Workstation {
    private Computer computer;
    private Monitor monitor;

    public Workstation(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }
}
```

**4. Implement Interfaces for Behavior**

Implementing interfaces allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the class and the outside world, and it's a way to ensure that certain methods are implemented by the class.

```java
public interface Payable {
    double getPaymentAmount();
}

public class Invoice implements Payable {
    private double amount;

    @Override
    public double getPaymentAmount() {
        return amount;
    }
}
```

**5. Use Accessor Methods and Mutator Methods (Getters and Setters)**

Accessor methods (getters) and mutator methods (setters) are used to access and modify the private variables of a class. They provide a controlled way of accessing and updating the state of an object.

```java
public class Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0.0) {
            this.salary = salary;
        }
    }
}
```

**6. Make Classes Immutable If Possible**

An immutable class is one whose state cannot be changed after it is created. Immutable classes are simpler to understand and use, and they are inherently thread-safe.

```java
public final class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
```

**7. Minimize Class and Method Visibility**

By keeping classes and methods as inaccessible as possible (using private or package-private access levels), you minimize the exposure of implementation details, reduce the risk of unintended usage, and enhance encapsulation.