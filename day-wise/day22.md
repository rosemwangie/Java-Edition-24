## 19/02

<details open> 
<summary>

# 4.5 Method Parameters

- **Passing by Value**: Java methods receive parameters by value, meaning a copy of the value is passed into the method.
- **Immutable Objects**: Changing the object inside the method doesn't affect the original object.
- **Mutable Objects**: Modifications to the attributes of objects passed into methods can affect the original objects, even though the object reference itself is passed by value.
- **Varargs**: Allows a method to accept a variable number of arguments of a specified type.

```java
public void varArgsMethod(String... strings) {
    for (String str : strings) {
        // process str
    }
}
```

</summary>
</details>