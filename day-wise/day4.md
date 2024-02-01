# 01/02

<details open>
  <summary>3.7 Output and Input</summary>

  To make our programs useful to need to accept input and properly format the program output. 
   
### This section covers:
  - Handling input data
  - Formatting data for human-readable output
  - Reading from and writing to files

  

<hr>

### 3.7.1 Reading Input

 - Tool: Use `Scanner` class for reading output<br>
 - How: Create a `Scanner` ojbect to read data (like strings and integers) from the console. We print output to the `standard output stream` (the console window) by calling `System.out.println`. To read from the console you first construct a `Scanner` that is attached to `System.in`

 > **_NOTE:_**  We use the `nextLine` method because the input might contain spaces. To read a single word(delimited by whitespaces)



```java
Scanner fetch = new Scanner(System.in);
String name = fetch.nextLine(); //Reads a string
int age = fetch.nextInt; //Read an integer
```

To read an integer, use the `nextInt` method. 

```java
System.out.println("How old are you?");
Scanner fetch = .nextInt(); //Reads an integer
```

 > **_NOTE:_**  Similarly the `nextDouble` method reads the next floating-point number

<hr>

  ### 3.7.2 Formatting Output
- Tool: Use `System.out.printf`.<br>
- How: Format strings with placeholders for variables(e.g., `%d` for integers, `%s` for strings, `%.2f` for floating-point numbers with two decimals)

```java
System.out.printf("Total: $&.2f\n");
```

<hr>

  ### 3.7.3 File Input and output
- Reading Files: Use `BufferedReader` combined with `FileReader`.<br>
- Writing Files: Use `BufferedWriter` combined with `FileWriter`.

```java
//Reading example
BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
```
```java
//Writing example
BufferedReader writer = new BufferedReader(new FileWriter("output.txt"));
```

<hr>

## Putting it all together:

```java
import java.util.*;

public class InputTest {
  public static void main(String[] args){

        //get first input
        System.out.print("What it your name?");
        Scanner fetch = new Scanner(System.in);
        String name = fetch.nextLine();

        //get second input
        System.out.print("How old are you?");
        int age = fetch.nextInt();

        //display output on console
        System.out.println("Hello, " + name + " .Next year, you'll be " + (age + 1));

  }
}
```

</details>