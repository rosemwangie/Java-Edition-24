## 07/02

<details open>
  <summary><strong>Chapter 3.10 - Arrays</strong></summary>
  
  ### 3.10.5 Command-Line Parameters
  - You can pass information to a Java program when you run it through command-line parameters.
  - These parameters are stored in an array called `args` in the `main` method.
  - For example, if you run `java MyProgram arg1 arg2`, `args` will contain `["arg1", "arg2"]`.
  - Example: 
  ```java
  public static void main(String[] args) {
    for (String arg : args) {
        System.out.println("Argument: " + arg);
    }
  }
  ```
  
  ### 3.10.6 Array Sorting
  - Java provides built-in methods for sorting arrays.
  - You can use `Arrays.sort(arrayName)` to sort an array in ascending order.
  - Example:
    ```java
    int[] numbers = {3, 1, 2};
    Arrays.sort(numbers);
    ```
</details>
