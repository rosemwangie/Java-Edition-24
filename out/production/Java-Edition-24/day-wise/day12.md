## 09/02

<details>
<summary>Objects & Classes</summary>

## 4.1 Introduction to Object-Oriented Programming

Object-oriented programming (OOP) is a programming paradigm based on the concept of `objects`, which can contain data, in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods).

### 4.1.1 Classes

A class specifies objects are made. It's a `blueprint` for creating objects (a particular data structure), providing initial values for state (member variables or attributes), and implementations of behavior (member functions or methods).

**Example:**
```java
public class Bicycle {
    
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
```

### 4.1.2 Objects
An object is an instance of a class. When a class is defined, no memory is allocated until objects are created from the class blueprint.

Example:

```java
Bicycle bike1 = new Bicycle(30, 0, 8);
Bicycle bike2 = new Bicycle(20, 10, 5);
```

### 4.1.3 Identifying Classes
- Identifying classes is a fundamental step in OOP design. 
- This involves `abstracting` and `encapsulating` the relevant data and behaviors of entities in your problem domain into classes.
- **Data Abstraction**: Focus on the essential qualities of an entity rather than one specific example.
- **Encapsulation**: Hide the internal state and require all interaction to be performed through an object's methods.

### 4.1.4 Relationships between Classes
Classes can relate to each other in several ways:

- `Inheritance`: A class can inherit fields and methods from another class.
- `Composition`: A class can contain instances of other classes.
- `Association`: A general relationship between objects.
- `Aggregation`: A special form of association with a whole-part relationship.

Example (Composition):

```java
public class Engine {
    // Engine class details
}

public class Car {
    private Engine engine; // Composition: Car HAS-A Engine
    
    public Car() {
        engine = new Engine(); // Initialize the Engine when Car is created
    }
}
```

</details>