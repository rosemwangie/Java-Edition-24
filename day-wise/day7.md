## 04/02

## pattern printing

## Challenge 1

`Write a java program that will print the following pattern using loops?`

*<br>
**<br>
***<br>
****<br>
***<br>
**<br>
*<br>


# Solution 1

```java
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("How many stars do you want?");
        try (Scanner scanner = new Scanner(System.in)) {
            int noOfStars = scanner.nextInt();

            for (int i = 1; i <= noOfStars; i++) { // row
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = noOfStars - 1; i >= 0; i--) { // row
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

```