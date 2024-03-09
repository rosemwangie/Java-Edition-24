package codeExamples.Inheritance;

// Example 1

/**
 *Explanation of the snippet above
 * - Superclass(Animal):
 * 	- Has a field `type` that signifies the type of the animal.
 * 	- Includes a method `eat()` that prints a general statement about eating.
 * -  Subclass(Dog):
 * 	- Uses `extends` keyword to inherit from `Animal`.
 * 	- Adds its own field `name` to give a specific name of the dog.
 * 	- Includes a constructor to initialize `name` when a new `Dog` object is created.
 * 	- Contains an additional method `display` to print the dog's name and type.
 * - Using inheritance
 * 	- The `Dog` class inherits the `eat()` method from the `Animal` class. When `myDog.eat()` is called, it shows that `Dog` can use the `eat` method of `Animal`.
 * 	- The `Dog` class adds its own behavior with the `display()` method, showcasing how subclasses can extend superclass functionality.
 */

public class MainRosa {
    public static void main(String[] args) {
        Dog myDog = new Dog("Peanut");
        myDog.eat(); // Method from superclass
        myDog.display();// Method from subclass
    }

    // superclass
    public static class Animal {
        // field of the superclass
        String type = "animal";

        // Method of Superclass
        void eat() {
            System.out.println("This animal eats snacks");
        }
    }

    // Subclass
    static class Dog extends Animal {
        String name;

        // Constructor of subclass
        Dog(String name) {
            this.name = name;
        }

        // Additional method in subclass
        void display() {
            System.out.println("Name: " + name + ", Type: " + type);
        }
    }
}
