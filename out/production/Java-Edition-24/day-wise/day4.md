## 01/02

<details open>
  <summary>3.7 Output and Input</summary>

  To make our programs useful to need to accept input and properly format the program output. 
   
#### This section covers:
  - Handling input data
  - Formatting data for human-readable output
  - Reading from and writing to files

<hr>
<details open>

<summary>3.7.1 Reading Input </summary>

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
---
 > **_NOTE:_**  Similarly the `nextDouble` method reads the next floating-point number
---


#### Putting it all together:

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

---
 > **_NOTE:_**  The `Scanner` class is not suitable for reading a password from a console since the input is plainly visible to anyone. 
---

To read a password, use the console class. 

```java
Console cons = System.console();
String username = cons.readLine("User name: ");
char[] password = cons.readPassword("Password: ");
```
<!-- <hr> -->

</details>

 
<details open>

<summary>3.7.2 Formatting Output</summary>

- Tool: Use `System.out.printf`.<br>
- How: Format strings with placeholders for variables(e.g., `%d` for integers, `%s` for strings, `%.2f` for floating-point numbers with two decimals)

```java
//
double y = 1000.00 / 3.00;
System.out.println(y);
System.out.printf("Total: %.2f\n", y);
```
<hr>

</details>



<details open>

<summary>3.7.3 File Input and output</summary>

- Writing Files: Use `BufferedWriter` combined with `FileWriter`.<br>
- Reading Files: Use `BufferedReader` combined with `FileReader`.

<br>

<strong>BufferWriter</strong>
- `BufferWriter` is used for writing text data efficiently.
- It wraps a `FIleWriter`, which is a connection stream for writing to character files.
- The `write()` methods is used to write strings to the file, and `newLine()` can be used to insert a newline character.
- As with `BufferReader`, always close the `BufferWritter` to ensure that all data is flushed to the file and resources are released. Again, using try-with-resources is recommended for resource management.

```java
//Writing example
BufferedReader writer = new BufferedReader(new FileWriter("output.txt"));
```

<strong>BufferReader</strong>

- `BufferReader` provides an efficient method for reading text data line by line with `readLine`.
- It wraps a `FileReader`, which is a connection stream for reading character files.
- The `readLine()` method returns null when the end of the stream(file) is reached.
- Always close the `BufferedReader` to release system resources. Preferably, use a try-with- resources statement to handle this automatically.

```java
//Reading example
BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
```
```java
//putting it all together
package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing a new file");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        System.out.println(reader.readLine());
        reader.close();

    }
}

```

> **_NOTE:_** Modern Java applications might prefer using java.nio.file.Files for many file operations due to its simplicity and more comprehensive suite of functionalities.

<hr>
</details>


</details>