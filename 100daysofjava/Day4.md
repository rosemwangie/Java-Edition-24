# 01/02
<details open>
  <summary>3.7 Output and Input</summary>
   
### This section covers:
  - Handling input data
  - Formatting data foor human-readable output
  - Reading from and writing ro files

<hr>

### 3.7.1 Reading Input

 - Tool: Use `Scanner` class for reading output<br>
 - How: Create a `Scanner` ojbect to read data (like strings and integers) from the console. 

```java
Scanner fetch = new Scanner(System.in);
String name = fetch.nextLine(); //Reads a string
int age = fetch.nectInt; //Read an integer
```
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

  ### 3.7.3 File Input and output
  ```java
  public class Main {
    public static void main(String[] args) {
        String name = "Timo";
        System.out.println(name);
    }
}
  ```
<hr>

</details>