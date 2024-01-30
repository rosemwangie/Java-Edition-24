# Java-Edition-24'


## Introduction to Java: 
  1. Basic syntax
  2. Variables - These are used to store data values.
  3. Data types - int, double, String, boolean
  4. Operators  - +, -, *, /, %, ++, --
  5. conditionals - if, else if, else


## Introduction to Java ~~
1. Brief History: A quick overview of Java and its importance. (memory mgt)
 - Java is a programming language that allows us to write instructions to perfomrm tasks
 - Java provides a platform for your code to run. It has a set of tools and libraries that help you build programs
   
   ### Some of the Key Features 
   1. <strong>WORE</strong>(Write Once Run Everywhere) - This is a famous concept. You write your code once, and it can run on any device that has Java installed, regardless of the operation system (mac, windows & linux)
   2. <strong>Object Oriented</strong>: Java organizes code around "objects" - think of these as little modules or building blocks for your programs

   ### Why is Java important
   1. It's widely used - for mobile apps to large scale enterprise systems, Java is everywhere
   2. Huge Community 
   3. Career opportunities - Java skills are high in demand
   4. Applications - Java is used for web development, mobile apps, desktop applications, large systems in bank and financial institutions.
   5. Cross-platforms it's ability to runon different devices makes it a versatile choice for developers.


## Basic Syntax: ~~
### Basic Structure of a Java Program: Explain the structure (classes, methods, the main method).
#### 1. Class
   Think of a class as a blueprint or a template for creating objects. In java almost everything is written in a class
    Example: 
    ```java
     public class MyClass {...}
    ```
   
#### 2. Methods: 
  Methods are like actions or tasks. They are blocks of code that perform a specific task and can be called upon when needed.
    Example Inside the class:  
    
     ```java
      public void myMethod() {
        //code to be executed
      }
    ```
#### 3. The `main` method
  "special method in Java"
      . The `main` metjod is where your program starts running
      . It's a special method that java looks for when running a program 
      . It's always written in a specific way

      Example:
      ```java
        public static void main(String[] args){
          //code to be executed
        }
      ```
   #### 4. Putting it all together:
       Here's how a basic Java program looks.
       ```java
       public class Main{
        public static void main(String[] args){
          System.out.println("Hello World!");
        }
       }
       ```

#### Breakdown:
    i. public class HelloWorld{...} - defines a class namd 'HelloWorld'
    ii. public static void main(String[] args){...} - the main method is the entry point of the program
    iii. system.out.println("Hello world!") - A command that prints "Hello world" to the screen/console


## Data Types ~~
1. Primitive Data Types: Cover types like int, double, char, boolean, byte, float, and long
2. Non-Primitive Data Types: Explain how to use objects like String, arrays, and classes
2. Variables: Declaration, initialization, and scope.
3. Type Casting: Explain implicit and explicit casting.


## Operators ~~
1. Arithmetic Operators: +, -, *, /, %.
2. Relational Operators: ==, !=, >, <, >=, <=.

## Conditionals ~~
1. If-Else Statements: Basic control flow.
2. Switch Case: When and how to use it.

## Hands-On Session ~~
1. Hello World: Write a program that prints "Not Hello World!" to the console.
2. Variables: Declare and initialize variables of different data types.
3. Arithmetic Operators: Perform arithmetic operations and display results.
4. Relational Operators: Compare values and display results.
5. If-Else Statements: Write an if-else statement and display a message.
6. Switch Case: Use a switch case statement and display a message.
7. Loops: Write a loop that prints numbers from 1 to 5.
8. Arrays: Declare and initialize an array and access its elements.
9. Methods: Define a method and call it.
10. Classes: Create a class and instantiate an object.