
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

### BigDecimal
- Used for operations requiring high precision with floating-point numbers.
- Crucial for applications such as financial calculations.
- Provides methods for basic arithmetic operations.

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


</details>