# Java `class` Keyword

The `class` keyword in Java is used to **create a class**.

A class is a **blueprint or template** from which objects are created.

---

## 1. Basic Syntax

```java
class ClassName {

    // variables
    // methods
}
```

Example:

```java
class Student {

    String name;
    int age;
}
```

Here, `Student` is a class containing two variables:

* `name`
* `age`

---

## 2. Creating an Object

An object is created using the `new` keyword.

```java
class Student {

    String name;
    int age;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ankit";
        s1.age = 23;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

### Output

```text
Ankit
23
```

---

## 3. Class with Methods

A class can contain both **variables and methods**.

```java
class Student {

    String name;

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ankit";

        s1.display();
    }
}
```

### Output

```text
Student Name: Ankit
```

---

## 4. Class with Constructor

A class can also have a constructor.

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ankit");

        s1.display();
    }
}
```

### Output

```text
Name: Ankit
```

---

## 5. Multiple Objects

One class can be used to create multiple objects.

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ankit");
        Student s2 = new Student("Rahul");

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
```

### Output

```text
Ankit
Rahul
```

Both objects are created from the same `Student` class.

---

## Class vs Object

| Class                                  | Object                         |
| -------------------------------------- | ------------------------------ |
| Blueprint                              | Real instance                  |
| Defines properties and behavior        | Contains actual values         |
| Does not represent a specific instance | Represents a specific instance |
| Example: `Student`                     | Example: `s1`                  |

Example:

```java
Student s1 = new Student();
```

Here:

* `Student` → Class
* `s1` → Object reference
* `new Student()` → Creates the object

---

## Key Points

* `class` is used to define a class.
* A class can contain **variables, methods, constructors, and other members**.
* Objects are created from a class using `new`.
* One class can create multiple objects.
* A class is commonly described as a **blueprint for objects**.

---

### Quick Example

```java
class Car {

    String brand;

    void drive() {
        System.out.println(brand + " is driving");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "BMW";
        car.drive();
    }
}
```

### Output

```text
BMW is driving
```

> **`class` defines the blueprint from which objects are created in Java.**
