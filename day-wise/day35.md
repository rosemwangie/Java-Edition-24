## 02/03

### 5.1.5 Polymorphism

 Polymorphism in java means an object can take on many forms and it occurs when classes
 are related by inheritance.

 Polymorphism is useful in java because it allows us to re-use attributes and methods of an existing class in a derived class

 There are two types of Polymorphism,they are: 


 ### Runtime Polymorphism

 It is also known as dynamic polymorphism and it is implemented through method overriding


 ### Compile-time Ploymorphism

 Also known as static polymorphism is  done by method-overloading


### 5.1.6 Understanding Method Calls

It is imperative that we understand  the technical details of how a method call is applied to an object.

This paragraph talks about how methods are called in Java. Here's a simplified breakdown:

1. **Finding the Method**: When you call a method like `x.f(args)`, the compiler looks at the type of `x` and the method name `f`. It checks all methods called `f` in that class and its superclasses to know all possible options.

2. **Choosing the Method**: The compiler picks the method that best matches the arguments you've given. If there's only one best match, that's the one chosen. If there's none or multiple matches, it reports an error.

3. **Binding**: If the method is private, static, final, or a constructor, it knows exactly which method to call (static binding). Otherwise, it depends on the actual type of `x`, and dynamic binding is used at runtime.

4. **Runtime Execution**: When the program runs, the virtual machine calls the appropriate method based on the actual type of the object. It does this by precomputing a method table for each class, which lists all methods and their signatures.

5. **Extensibility**: Dynamic binding allows for extending programs without changing existing code. If a new class is added and a method call applies to it, the method is automatically called without recompiling existing code.

6. **Visibility**: When overriding a method, the subclass method must be at least as visible as the superclass method. For example, if the superclass method is public, the subclass method must also be declared public.





### 5.1.7 Preventing Inheritance: Final Classes and Methods 
### 5.1.8 Casting
### 5.1.9 Pattern Matching for instanceof
### 5.1.10 Protected Access