# Java Methods

A **method** in Java is a block of code that performs a specific task. Methods help make programs more organized, reusable, and easier to understand.

## 1. Method Declaration

A method is declared using the following syntax:

```java
accessModifier returnType methodName(parameters) {
    // Method body
}
```

### Example

```java
public static void greet() {
    System.out.println("Hello, Welcome to Java!");
}
```

Here:

* `public` → Access modifier
* `static` → Method belongs to the class
* `void` → Method does not return any value
* `greet` → Method name
* `()` → Parameters section

### Calling a Method

```java
public class Main {

    static void greet() {
        System.out.println("Hello, Welcome to Java!");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

**Output:**

```text
Hello, Welcome to Java!
```

---

## 2. Parameters

**Parameters** are variables that allow us to pass data to a method.

### Example

```java
public class Main {

    static void displayName(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        displayName("Ankit");
    }
}
```

**Output:**

```text
Hello Ankit
```

A method can also have multiple parameters:

```java
public class Main {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add(10, 20);
    }
}
```

**Output:**

```text
30
```

---

## 3. Return Type

A method can return a value using the `return` keyword.

### Syntax

```java
returnType methodName(parameters) {
    return value;
}
```

### Example

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);
    }
}
```

**Output:**

```text
30
```

### Using `void`

When a method does not return any value, we use `void`.

```java
static void message() {
    System.out.println("This method does not return anything.");
}
```

---

## 4. Static vs Non-Static Methods

### Static Method

A **static method** belongs to the class. It can be called without creating an object.

```java
public class Main {

    static void showMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        showMessage();
    }
}
```

You can also call it using the class name:

```java
Main.showMessage();
```

### Non-Static Method

A **non-static method** belongs to an object. We need to create an object before calling it.

```java
public class Main {

    void showMessage() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.showMessage();
    }
}
```

### Difference

| Static Method                                                 | Non-Static Method                             |
| ------------------------------------------------------------- | --------------------------------------------- |
| Belongs to the class                                          | Belongs to an object                          |
| Can be called without creating an object                      | Requires an object                            |
| Called using the class name or directly inside the same class | Called using an object                        |
| Cannot directly access non-static members                     | Can access both static and non-static members |

---

## 5. Method Overloading

**Method overloading** means creating multiple methods with the same name but different parameters.

The difference can be in:

* Number of parameters
* Type of parameters
* Order of parameter types

### Example: Different Number of Parameters

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));

        System.out.println(add(10, 20, 30));
    }
}
```

**Output:**

```text
30
60
```

### Example: Different Parameter Types

```java
public class Main {

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(multiply(5, 4));

        System.out.println(multiply(5.5, 4.5));
    }
}
```

---

## Key Points

* A method is used to perform a specific task.
* Methods improve **code reusability**.
* Parameters allow data to be passed into methods.
* A return type defines what value a method returns.
* `void` means the method does not return a value.
* Static methods belong to a class.
* Non-static methods belong to objects.
* Method overloading allows multiple methods with the same name but different parameters.

---

## Conclusion

Java methods are an important part of writing clean and reusable programs. By using methods, we can divide a large program into smaller and manageable parts. Features like **parameters, return types, static methods, non-static methods, and method overloading** make Java programs more flexible and organized.
