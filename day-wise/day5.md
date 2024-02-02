
<details>

<summary>3.9 Big Numbers </summary>
This section discusses handling very large or very small numbers in Java, which surpass the range of standard primitive data types using `BigInteger` and `BigDecimal`.

## Key Classes
- **BigInteger**: For large integers.
- **BigDecimal**: For large floating-point numbers.

## Main Points

### BigInteger
- Used for mathematical operations on large integers.
- Useful in applications like cryptography.
- Operations include addition, subtraction, multiplication, division, and modulus.

## Example:

```java
//BigInteger example
import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");

        BigInteger result = num1.add(num2);

        System.out.println("Sum: " + result);
    }
}
```

### BigDecimal
- Used for operations requiring high precision with floating-point numbers.
- Crucial for applications such as financial calculations.
- Provides methods for basic arithmetic operations.

## Example:

```java
//Bigdecimal example
import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("123.456");
        BigDecimal num2 = new BigDecimal("987.654");

        BigDecimal result = num1.add(num2);

        System.out.println("Sum: " + result);
    }
}
```

### Usage Tips
- Construct `BigInteger` and `BigDecimal` objects from string values.
- Objects are immutable; operations return a new object.
- Use when necessary due to slower performance compared to primitive types.

## Example:

```java
BigInteger a = new BigInteger("123456789012345678901234567890");
BigInteger b = new BigInteger("987654321098765432109876543210");
BigInteger sum = a.add(b); // Adds a and b

BigDecimal c = new BigDecimal("12345.67890");
BigDecimal d = new BigDecimal("98765.43210");
BigDecimal product = c.multiply(d); // Multiplies c and d
```

#### Points to note:


### BigInteger:

## Immutable:
BigInteger objects are immutable, meaning their values cannot be changed after instantiation. Any arithmetic operation on BigInteger returns a new BigInteger instance.


## Use Constructors Wisely:
Be mindful of how you construct BigInteger objects. If youre dealing with integers, use the constructor that takes a String argument to avoid any loss of precision that can occur when using the BigInteger(int) constructor.

```java
BigInteger num = new BigInteger("123456789012345678901234567890");
```

## Arithmetic Operations:
All basic arithmetic operations (addition, subtraction, multiplication, division, etc.) are supported by BigInteger. Methods like add, subtract, multiply, and divide perform these operations and return a new BigInteger instance.

```java
BigInteger result = num1.add(num2);
```

## Comparison:
BigInteger provides methods for comparison, such as compareTo, equals, max, and min.

"""
int comparison = num1.compareTo(num2);
"""


### BigDecimal:

## Immutable:
Similar to BigInteger, BigDecimal objects are also immutable. Any arithmetic operation on BigDecimal returns a new BigDecimal instance.

## Precision and Rounding:
When working with BigDecimal for decimal arithmetic, be aware of the importance of precision and rounding. BigDecimal allows you to specify the precision and rounding mode when performing operations.

```java
BigDecimal result = num1.add(num2).setScale(2, RoundingMode.HALF_UP);
```

## Avoid Using double or float:
When initializing BigDecimal with floating-point values, avoid using the BigDecimal(double) constructor, as it might introduce precision errors. Instead, use the BigDecimal(String) constructor.

```java
BigDecimal decimalValue = new BigDecimal("123.456");
```

## Comparison:
Similar to BigInteger, BigDecimal provides methods for comparison, such as compareTo, equals, max, and min.

```java
int comparison = decimal1.compareTo(decimal2);
```

## Arithmetic with Scale:
When performing division with BigDecimal, be aware of the scale of the result. You might need to adjust the scale using the setScale method.

```java
BigDecimal result = num1.divide(num2, 2, RoundingMode.HALF_UP);
```


</details>