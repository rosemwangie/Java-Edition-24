## 29/1

### Introduction to Java & Java Syntax Basics
<hr>

<b>A quick overview of Java and its importance.</b>
 - Java is a programming language that allows us to write instructions to perfomrm tasks
 - Java provides a platform for your code to run. It has a set of tools and libraries that help you build programs
   
### Some of the Key Features 
   1. <strong>`WORE`</strong>(Write Once Run Everywhere) - This is a famous concept. You write your code once, and it can run on any device that has Java installed, regardless of the operation system (mac, windows & linux)
   2. <strong>`Object Oriented`</strong>: Java organizes code around <i>"objects"</i> - think of these as little modules or building blocks for your programs

   ### Why is Java important
   1. It's widely used - for mobile apps to large scale enterprise systems, Java is everywhere
   2. Huge Community 
   3. Career opportunities - Java skills are high in demand
   4. Applications - Java is used for web development, mobile apps, desktop applications, large systems in bank and financial institutions.
   5. Cross-platforms it's ability to runon different devices makes it a versatile choice for developers.

### Basic Structure (`classes`, `methods`, the `main method`).
## 1. Class
 Think of a class as a blueprint or a template for creating objects. In java almost everything is written in a class
    Example: 
    ```java
     public class MyClass {...}
    ```
   
## 2. Methods: 
Methods are like actions or tasks. They are blocks of code that perform a specific task and can be called upon when needed.
Example Inside the class:  
    
```java
  public void myMethod() {
    //code to be executed
 }
```
## 3. The `main` method
"special method in Java"
      . The `main` metjod is where your program starts running
      . It's a special method that java looks for when running a program 
      . It's always written in a specific way

Example:
```java
 public static void main(String[] args){
    //code to be executed
    System.out.println("Code to be executed");
  }
```
## 4. Putting it all together:
Here's how a basic Java program looks.
```java
public class Main{
  public static void main(String[] args){
    System.out.println("Hello World!");
  }
}
```

#### Breakdown:
  i. `public class HelloWorld{...}` - defines a class namd 'HelloWorld'<br>
  ii. `public static void main(String[] args){...}` - the main method is the entry point of the program<br>
  iii. `system.out.println("Hello world!")` - A command that prints "Hello world" to the screen/console


## Data Types ~~
1. <b>Primitive Data Types</b>: Cover types like int, double, char, boolean, byte, float, and long
2. <b>Non-Primitive Data Types</b>: Explain how to use objects like String, arrays, and classes
2. <b>Variables</b>: Declaration, initialization, and scope.
3. <b>Type Casting</b>: Explain implicit and explicit casting.


## Operators ~~
1. `Arithmetic Operators`: +, -, *, /, %.
2. `Relational Operators`: ==, !=, >, <, >=, <=.

## Conditionals ~~
1. If-Else Statements: Basic control flow.
2. While loop: 
3. Do while loop:
4. Switch Case: When and how to use it.