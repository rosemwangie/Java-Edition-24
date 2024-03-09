## 31/01

## Day 3: Strings & Conditionals

# Strings
Java strings are sequences of Unicode characters. For example, the string "Java\\u2122" consists of the five Unicode characters J, a, v, a, and ™.

> [! Note about Java Strings]
> Java does not have a built-in string type. Instead, the standard Java library contains a predefined class called, naturally enough, *String*. Each quoted string is an instance of the *String class:P

```java
String e ="";//an empty string 
String greeting="Hello";
```
### Strings

### Substrings

Extracting substrings or characters within the *String* class.

```java
String greeting="Hello"; 
String s = greeting.substring(0, 3); // Output Hel
```

> [!NOTE]
> The *second* parameter of substring is the first position that you do not want to copy. In our case, we want to copy positions 0, 1, and 2 (from position 0 to position 2 *inclusive*). As substring counts it, this means from position 0 inclusive to position 3 *exclusive*.

### Concatenation 

Java, like python or javascript, allows you to use + to join (concatenate) two strings.

```java
String expletive="Expletive";
String PG13="deleted"; 
String message=expletive + PG13; // Expletivedeleted
```

> NOTE 🗒 
> If you need to put multiple strings together, separated by a delimiter, use the static join method:

```java
String all = String.join("/","S", "M", "L","XL"); // all is the string "S / M / L / XL

// NB : / is the delimiter
```

#### Repeat Method
``` java
String repeated = "Java".repeat(3); //repeated is"JavaJavaJava"
```

### Strings Are Immutable

The String class gives no methods that let you change a character in an existing string.

```java
public class ImmutableStringExample{
	String str1 = "Hello";
	String str2 = str1;
	// Trying to modify str1
	str1 =str1 + " World"
	// Print both strings
	System.out.println('str1:' +str1) // Output: str1: Hello World
	System.out.println('str2:' +str2) // Output: str2: Hello
	/*
	When we try to modify str1 by concatenating "world" to it Java doesn't allow but
	instead it a new string "Hello World" and assigns its reference to str1
	*/
	
}
```

### Testing Strings for Equality

#### 1. equals

To test whether two strings are *equals*, use the equals method. The expression 
```java
s.equals(t) // returns true if the strings s and t are equal, false otherwise
```

> [!NOTE]
> Note that s and t can be string variables or string literals.
> For example, the expression 
> ``` java
> "Hello".equals(greeting) 
> ```
> is perfectly legal.

#### 2. equalsIgnoreCase

To test whether two strings are identical except for the upper/lowercase letter distinction, use the *equalsIgnoreCase* method.

```java
 "Hello".equalsIgnoreCase("hello")
```

> [!⚠ ]
> Do not use the * operator to test whether two strings are equal! It only determines whether or not the strings are stored in the same location.
> ``` java
> String greeting="Hello";// initialize greeting to a string 
> if (greeting*"Hello") ... // probably true
>  if (greeting.substring(0,3)*"Hel")... //probably false ```

#### 3 compareTo
C programmers never use * to compare strings but use strcmp instead. The Java method compareTo is the exact analog of strcmp.

```java
if(greeting.compareTo("Hello") * 0). .. // Returns a Boolean

// But Equals is much better
```

### Empty and Null Strings

#### Empty
The empty string "" is a string of length 0.

```java
if (str.length()*0)
 /// OR
if (str.equals(""))
```

#### Null
An empty string is a Java object which holds the string length (namely, 0) and an empty contents. However, a String variable can also hold a special value, called null, that indicates that no object is currently associated with the variable.

```java
if (str*null)
```

```java
//test that a string is neither null nor empty
if (str!=null&&str.length()!=0)
```



### Conditionals 

+ Conditionals in Java are used to make decisions based on certain conditions.
+ Set actions are executed only if your set conditionals are fulfilled.
+ Conditionals in Java include:
  * if else
  * while
  * do while


###  if else

The if...else statement executes a statement if a specified condition is truth.


Syntax

if(Boolean_expression) {
   // Executes when the Boolean expression is true
}else {
   // Executes when the Boolean expression is false
}


Here's a Sample code 

```java
class Loop{
    public static void main(String[] args){
             
   float grossSalary=100000;

   if (grossSalary<20000){
      System.out.println("No Tax");

   }else if(grossSalary>=20000 && grossSalary<=40000){

      System.out.println("Tax is 10%");
   }else if (grossSalary<=70000) {
      System.out.println("Tax is 20%");
   }else {
      System.out.println("Tax is 30%");
   }
      
   }
      
 }
```