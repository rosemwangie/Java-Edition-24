## 01/03

# 5: Inheritance

- Inheritance allows a class (subclass) to inherit properties and behaviors from another class (superclass)

## 5.1 Classes, Superclasses, and Subclasses

- When we create a new class (the sub class), we can say it "extends" another class (the parent class). This enables the child class to use all the stuff the parent class has.

``` java

    class Students {
        protected String online;
    }

    class Java extends Students {
        private double time;
    }

```

### 5.1.1 Defining Subclasses

- A Subclass, is a new class that inherits characteristics (fields and methods) from an existing class, which we call a superclass.

``` java 
    class Superclass {
    // Superclass 
}

    class Subclass extends Superclass {
    // Subclass 
}

```

### 5.1.2 Overriding Methods 

- This is making a subclass do something extra or diffrent from which the parent class does.

``` java

    class Superclass {
        void methodName() {
            // Superclass method
        }
    }

    class Subclass extends Superclass {
        @Override
        void methodName() {
            // Subclass method  (overrides superclass method)
        }
    }
```

### 5.1.3 Subclass Constructors 

- This initializes a subclass object, ensuring proper setup and can invoke a superclass constructors using a super() keyword.

``` java 

    class Superclass {
        Superclass() {
            // Superclass constructor
        }
    }

    class Subclass extends Superclass {
        Subclass() {
            super(); // Calls superclass constructor
            // Subclass constructor
        }
    }

```

### 5.1.4 Inheritance Hierarchies 

- They enable us to organize classes into a tree-like structure, where subclasses inherit properties and behaviors from their superclasses, forming a hierarchy of related classes.

``` java

    class Superclass {
        // Superclass members
    }

    class Subclass extends Superclass {
        // Subclass members
    }

    // Another subclass
    class SubSubclass extends Subclass {
        // SubSubclass members
    }

```
