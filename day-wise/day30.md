## 26/02 Notes

### 4.8 Packages

#### 4.8.1 Package Names
- Packages in Java are used to group related classes and interfaces, which helps in organizing the code and preventing naming conflicts.
- Package names should be in lowercase, and a company's internet domain name is often used in reverse as the package name prefix to ensure uniqueness. For example, `com.example.project`.
- Subpackages are separated by dots (e.g., `com.example.project.module`).

#### 4.8.2 Class Importation
- To use a class or an interface from a package, you need to import it into your code using the `import` statement.
- You can import a single class (e.g., `import java.util.List;`) or all classes in a package (e.g., `import java.util.*;`).

#### 4.8.3 Static Imports
- Static import allows you to access static members (fields and methods) of a class directly without class name qualification.
- Syntax: `import static package.ClassName.staticMember;` or `import static package.ClassName.*;` for all static members.

#### 4.8.4 Addition of a Class into a Package
- To place a class into a package, declare the package at the top of the Java source file before any class declarations, using the `package` keyword (e.g., `package com.example.project;`).

#### 4.8.5 Package Access
- Classes or interfaces defined in a package can be public or package-private (default access level).
- Public classes/interfaces can be accessed from outside their package, while package-private ones are accessible only within the package.

#### 4.8.6 The Class Path
- The classpath is a parameter in the Java environment that tells the Java Virtual Machine (JVM) and Java compiler where to find class files to load.
- It can be set as an environment variable or specified on the command line with the `-classpath` or `-cp` option.

#### 4.8.7 Setting the Class Path
- To set the classpath, you can use the `CLASSPATH` environment variable, the `-classpath` or `-cp` command-line option, or the classpath manifest attribute in a JAR file.
- The classpath string consists of one or more classpath entries (paths to directories, JAR, or ZIP files) separated by a semicolon (`;`) on Windows and a colon (`:`) on Unix-like systems.

