## 06/02

<details open>
  <summary><strong>Chapter 3.10 - Arrays</strong></summary>

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


</details>
