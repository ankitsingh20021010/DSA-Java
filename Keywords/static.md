# Java `static` Keyword

The `static` keyword in Java is used to create members that belong to the **class rather than to individual objects**.

A `static` member can be accessed using the **class name** without creating an object.

---

## 1. Static Variable

A `static` variable is shared by all objects of a class.

```java
class Student {

    String name;
    static String college = "BBD University";
}
```

Here, `college` is shared by every `Student` object.

### Example

```java
class Student {

    String name;
    static String college = "BBD University";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ankit");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}
```

### Output

```text
Ankit - BBD University
Rahul - BBD University
```

Both objects share the same `college` variable.

---

## 2. Accessing Static Variable

A static variable can be accessed directly using the class name.

```java
class Student {

    static String college = "BBD University";
}

public class Main {

    public static void main(String[] args) {

        System.out.println(Student.college);
    }
}
```

### Output

```text
BBD University
```

No object is required.

---

## 3. Static Method

A method declared with `static` belongs to the class.

```java
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {

        int result = Calculator.add(10, 20);

        System.out.println(result);
    }
}
```

### Output

```text
30
```

The method is called using:

```java
Calculator.add(10, 20);
```

---

## 4. Static Method Cannot Directly Access Instance Variables

A static method belongs to the class, while an instance variable belongs to an object.

Therefore, a static method cannot directly access a non-static variable.

```java
class Student {

    String name = "Ankit";

    static void display() {
        // System.out.println(name);  // Error
    }
}
```

To access `name`, an object is required.

---

## 5. Static Block

A static block is executed **when the class is loaded**, before the `main()` method runs.

```java
class Demo {

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
```

### Output

```text
Static Block
Main Method
```

---

## 6. Why Use `static`?

Use `static` when a member should be **shared across all objects** or when it logically belongs to the class itself.

Common examples:

```java
Math.max()
Math.sqrt()
Integer.parseInt()
```

These methods can be used without creating objects.

---

## Static vs Non-Static

| Static                           | Non-Static                    |
| -------------------------------- | ----------------------------- |
| Belongs to class                 | Belongs to object             |
| Can be accessed using class name | Usually accessed using object |
| One shared copy                  | Separate copy for each object |
| Object not required              | Object generally required     |

---

## Important Rules

### Static members can be accessed using the class name

```java
Student.college;
```

### Static methods cannot directly use `this`

```java
static void show() {
    // this.name;  // Error
}
```

Because `this` refers to the current object, while a static method does not belong to a particular object.

### `main()` is static

```java
public static void main(String[] args)
```

Java can call `main()` without creating an object of the class.

---

## Key Points

* `static` makes a member belong to the **class**.
* Static variables are **shared among all objects**.
* Static methods can be called without creating an object.
* A static method cannot directly access non-static members.
* A static method cannot use `this` or `super`.
* Static blocks execute when the class is loaded.

---

### Quick Example

```java
class Counter {

    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Objects: " + count);
    }
}

public class Main {

    public static void main(String[] args) {

        new Counter();
        new Counter();
        new Counter();

        Counter.showCount();
    }
}
```

### Output

```text
Objects: 3
```

> **`static` makes a member belong to the class instead of individual objects.**
