## 30/1

 # 3.3 Data Types 

- In Java, data types specify the size and type of values that variables can store. There are two main categories: `primitive` types, which include basic types like `integers` and `booleans`, and `reference` types, which include `objects` and `arrays`.


 ## 3.3.1 Integer Types  

- Java offers four main integer types to handle numbers without decimals. These vary by size and the range of values they can store:

- `byte`: A very small integer from -128 to 127. Useful for saving memory in large arrays.
- `short`: A small integer from -32,768 to 32,767.
- `int`: A default integer type, ranging from -2^31 to 2^31-1.
- `long`: A large integer from -2^63 to 2^63-1, useful for larger values.

```java 
int year = 2024;
long population = 7800000000L; // Note the 'L' suffix to indicate a long literal.
```
 

 
 ## 3.3.2 Floating-Point Types 

- Floating-point types represent numbers with fractional parts. They come in two sizes:

- **float: A single-precision 32-bit IEEE 754 floating point. It's less precise but saves memory.
- double: A double-precision 64-bit IEEE 754 floating point. It's the default choice for floating-point calculation due to its precision.

```java
float interestRate = 6.5F; // 'F' suffix denotes a float literal.
double price = 19.99;
```

 

 
 ## 3.3.3 The char Type 

- `char` represents a single 16-bit Unicode character. It can store any character or Unicode symbol.

```java
char grade = 'A';
char currencySymbol = '¥';

```

 

 
 ## 3.3.4 Unicode and the char Type  

- Java's use of Unicode for the char type allows it to represent characters and symbols from languages worldwide, facilitating internationalization.

```java
char chineseCharacter = '\u4e00'; // Represents the Chinese character for "one."
```
 

 
 ## 3.3.5 The boolean Type 

- `boolean` is the simplest type in Java, with only two possible values: true or false. It's commonly used in control flow statements.

```java
boolean isJavaEasy = true;
```
 
 
<hr>

 ## 3.4 Variables and Constants 

- Variables are placeholders for storing data, while constants are variables whose values cannot change once set.

## 3.4.1 Declaring Variables  
- Before using a variable, you must declare it by stating its type and name. This tells the compiler what kind of data it can store. 

```java
String name; // Declaration without initialization.
int age;

```

## 3.4.2 Initializing Variables  

- Initialization assigns a value to a variable at the time of declaration. It's a good practice to initialize variables to avoid unexpected behaviors.

```java 
String name = "John Doe";
int age = 25;

```

## 3.4.3 Constants  

- Constants are declared with the final keyword. Once assigned a value, it cannot be changed. This is useful for values that should remain constant throughout the execution of a program.

```java
final double PI = 3.14159;
```

## 3.4.4 Enumerated Types  

- Enumerations, or Enums, define a type by enumerating its possible values. This makes code more readable and less error-prone.

```java
enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

```
 
<hr>


 ## 3.5 Operators

- Operators perform operations on variables and values. Java provides a rich set of operators for mathematical, relational, and logical operations.

## 3.5.1 Arithmetic Operators  

- Java supports basic arithmetic operations: addition (+), subtraction (-), multiplication (`*`), division (`/`), and modulo (`%`).

```java
int sum = 10 + 5; // 15
double quotient = 20.0 / 3; // Approximately 6.6667
```

## 3.5.2 Mathematical Functions and Constants  

Java's Math class provides functions for more complex mathematical operations, like exponentiation, square root, and trigonometry.

```java
double sqrtOf81 = Math.sqrt(81); // 9.0
double powerOfTwo = Math.pow(2, 3); // 8.0

```

## 3.5.3 Conversions between Numeric Types  

- Automatic type conversion occurs when you assign a value of a smaller data type to a variable of a larger data type. 
- This is known as widening conversion and is done automatically by Java to avoid loss of information. However, when you need to assign a value of a larger data type to a variable of a smaller data type, you must perform an explicit cast because this can lead to loss of information.

```java 
int myInt = 100;
long myLong = myInt; // Automatic conversion from int to long
double myDouble = myLong; // Automatic conversion from long to double

// Explicit casting
double myDouble = 9.78;
int myInt = (int) myDouble; // myInt will be 9, losing the decimal part

```

## 3.5.4 Casts 

- Casting in Java is a way of converting a variable from one data type into another. As mentioned, explicit casting is necessary when converting a larger type to a smaller size type to avoid loss of data. Casts are done by prefixing the value with the target type in parentheses.

```java
double myDouble = 9.78;
int myInt = (int) myDouble; // Explicit casting to int, results in 9
```

## 3.5.5 Assignment  
- The assignment operator = is used to assign values to variables.

- In addition to the basic assignment, Java also supports compound assignment operators that combine arithmetic operations with assignment.

```java
int a = 10; // Basic assignment
a += 5; // Compound assignment, equivalent to a = a + 5; Now a is 15

```

## 3.5.6 Increment and Decrement Operators   

- Increment (++) and decrement (--) operators are used to increase or decrease a variable's value by 1, respectively. 
- They come in two forms: prefix, where the operation is performed before the value is returned, and postfix, where the operation is performed after the value is returned.

```java
int a = 10;
a++; // Postfix increment; a is now 11
++a; // Prefix increment; a is now 12
a--; // Postfix decrement; a is now 11
--a; // Prefix decrement; a is now 10

```
## 3.5.7 Relational and boolean Operators   

- Relational operators compare two operands and return a boolean value (true or false). Java provides several relational operators: == (equals), != (not equals), < (less than), > (greater than), <= (less than or equal to), and >= (greater than or equal to).

- Boolean operators are used to perform logical operations on boolean values (true or false). The main boolean operators are && (logical AND), || (logical OR), and ! (logical NOT).

```java
int a = 5, b = 10;
boolean result;
result = (a < b) && (b > 5); // true, because both conditions are true
result = (a > b) || (a < 10); // true, because at least one condition is true
result = !(a == b); // true, because the condition "a equals b" is false
```
 
<hr>