## 01/03

# 5: Inheritance
> It's the kind of programming that focuses on `Objects`

In Java:
- A new class can inherit `methods` and `characteristics` (fields) from an existing class
- This allows you to reuse what's already been created without writing again.
- You can also add new features and abilities to the new class to make it unique.

![Screenshot 2024-03-09 at 14.12.11.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fdj%2Fxrbnzv2d7x383pvh43znjzy00000gp%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_kdpHo2%2FScreenshot%202024-03-09%20at%2014.12.11.png)

### Explanation of the snippet above
- Superclass(Animal):
    - Has a field `type` that signifies the type of the animal.
    - Includes a method `eat()` that prints a general statement about eating.
-  Subclass(Dog):
    - Uses `extends` keyword to inherit from `Animal`.
    - Adds its own field `name` to give a specific name of the dog.
    - Includes a constructor to initialize `name` when a new `Dog` object is created.
    - Contains an additional method `display` to print the dog's name and type.
- Using inheritance
    - The `Dog` class inherits the `eat()` method from the `Animal` class. When `myDog.eat()` is called, it shows that `Dog` can use the `eat` method of `Animal`.
    - The `Dog` class adds its own behavior with the `display()` method, showcasing how subclasses can extend superclass functionality.

### 5.1 Classes, Superclasses, and Subclasses
### 5.1.1 Defining Subclasses
### 5.1.2 Overriding Methods 
### 5.1.3 Subclass Constructors ### 5.1.4 Inheritance Hierarchies 

