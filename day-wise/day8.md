## 05/02

<details open>
  <summary><strong>Chapter 3.10 - Arrays</strong></summary>

  ### 3.10.1 Declaring Arrays
  - In Java, arrays are like containers that can hold multiple values of the same type.
  - To create an array, you first specify the type of values it will hold (e.g., `int`, `String`), followed by square brackets `[]`, and then give it a name.
  - For example, 
  ```java
  int[] numbers;
  // declares an empty array called `numbers` that can store integers.
  ```

  ### 3.10.2 Accessing Array Elements
  - Arrays are numbered starting from 0. The first element is at index 0, the second at index 1, and so on.
  - To access a specific element in an array, you use square brackets `[]` and provide the index.
  - For example, if `numbers` is an array, `int element = numbers[0];` gets the first element.
    ```java
    int[] numbers = {1, 2, 3}; // Initializing an array
    int firstElement = numbers[0]; // Accessing the first element (1)
    ```

  ### 3.10.3 The "for each" Loop
  - The "for each" loop simplifies iterating through all elements in an array.
  - Syntax: `for (elementType element : arrayName) { /* Loop body */ }`
  - It automatically goes through each element, one by one.
  - For example, to print all elements in an array:
    ```java
    for (int num : numbers) {
        System.out.println(num);
    }
    ```

  ### 3.10.4 Array Copying
  - You can copy the contents of one array into another using various methods.
  - One way is to use `System.arraycopy()` to copy elements from a source array to a destination array.
  - Example:
    ```java
    int[] sourceArray = {1, 2, 3};
    int[] destinationArray = new int[3];
    System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
    ```

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
