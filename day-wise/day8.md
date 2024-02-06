## 05/02

<details>
<summary>3.10 Arrays</summary>
<details><summary>3.10.3 The “for each” Loop</summary>

- Iteration of elements in an array.
- Array elements are held in a variable then executed in the body of the loop.

### Example

```java
    public class Main {
    public static void main(String[] args) {
        String[] students = {"Brian", "Kepha", "Rosa", "Ish"};

        for (String student : students) {
            System.out.println(student);
        }
    }
}

```

- The array `student` is a loop counter which is declared as a variable of the same type as the base array `students`.

🎥 Watch this resources to understand more about a for each loop.

[Youtube-Tutorial](https://youtu.be/UZOxpbtlVWg?si=GWMb_NqVlHvJlCEB)

</details>
<!-- Continue adding your notes on The “for each” Loop and code snippets-->
<details><summary>3.10.4 Array Copying</summary>

- It's used to copy elements  from one array to another, or parts of an array to other arrays.   

### Example

```java
    public class Main {
        public static void main(String[] args) {
            String[] students = {"Brian", "Kepha", "Rosa", "Ish"};

        // Create a new array with the same length as students
            String[] studentsCopy = new String[students.length];

        // backup of elements from the original array students to the copy
            for (int i = 0; i < students.length; i++) {
                studentsbackup[i] = students[i];
            }

            System.out.println("\nCopied students array:");
            for (String student : studentsbackup) {
            System.out.println(student);
        }
    }
}


```

- We can also modify arrays in the `students` without affecting the elements in array `student`.
### Example 

```java
    public class Main {
    public static void main(String[] args) {
        String[] students = {"Brian", "Kepha", "Rosa", "Ish"};

        // Create a new array with one extra element
        String[] studentsWithAmbrose = new String[students.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < students.length; i++) {
            studentsWithAmbrose[i] = students[i];
        }

        // Additton of student "Ambrose" to the new array
        studentsWithAmbrose[students.length] = "Ambrose";

        // Print the updated array
        System.out.println("Updated students array:");
        for (String student : studentsWithAmbrose) {
            System.out.println(student);
        }
    }
}

```

- In this example we have used  a `for` loop to copy each element from the `students` array into the `studentsWithAmbrose` array, then added the new student `"Ambrose"`.

### Other ways to achieve this
- System.arraycopy
- clone
- Arrays.copyOf

🎥 Watch this resources to understand more about array copying.

[Youtube](https://youtu.be/_86FMWNfGOc?si=ER8QGQk2AaJyuekq)

> **_NOTE:_** The choice of method should align with your specific use case and whether you need a shallow or deep copy of the array.
<!-- Continue adding your notes on Array Copying and code snippets-->
</details>