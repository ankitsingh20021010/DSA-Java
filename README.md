# Java OOPs – Four Pillars

Object-Oriented Programming (OOP) is a programming approach based on **objects and classes**. Java is an object-oriented programming language that mainly follows four important pillars of OOP:

1. **Encapsulation**
2. **Inheritance**
3. **Polymorphism**
4. **Abstraction**

---

## 1. Encapsulation

**Encapsulation** means wrapping data (variables) and methods into a single unit called a **class**.

It also helps to protect data by using access modifiers such as `private`, `public`, and `protected`.

### Example

```java
class Student {
    private String name;
    private int age;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
```

Here, `name` and `age` are private, so they cannot be accessed directly from outside the class.

### Benefits

* Data security
* Data hiding
* Better code control
* Easy maintenance

---

## 2. Inheritance

**Inheritance** allows one class to acquire the properties and methods of another class.

In Java, inheritance is achieved using the `extends` keyword.

### Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.bark();
    }
}
```

### Output

```text
Animal makes sound
Dog barks
```

Here, `Dog` inherits the `sound()` method from the `Animal` class.

### Benefits

* Code reusability
* Reduces duplicate code
* Creates a parent-child relationship

---

## 3. Polymorphism

**Polymorphism** means **"many forms"**.

In Java, polymorphism allows the same method or object to behave differently in different situations.

There are two main types:

### A. Compile-Time Polymorphism

It is achieved using **method overloading**.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

The method name is the same, but the parameters are different.

### B. Run-Time Polymorphism

It is achieved using **method overriding**.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

```java
class Main {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
```

### Output

```text
Dog barks
```

The method that runs is decided at **runtime**.

---

## 4. Abstraction

**Abstraction** means hiding unnecessary implementation details and showing only the important features.

In Java, abstraction can be achieved using:

* Abstract classes
* Interfaces

### Example Using Abstract Class

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

```java
class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
```

### Output

```text
Dog barks
Animal eats
```

The user does not need to know **how** `sound()` is implemented; they only need to know that the animal can make a sound.

---

# Four Pillars at a Glance

| Pillar        | Meaning                               | Main Concept               |
| ------------- | ------------------------------------- | -------------------------- |
| Encapsulation | Wrapping data and methods             | Data Hiding                |
| Inheritance   | Acquiring properties of another class | Code Reusability           |
| Polymorphism  | One name, many forms                  | Overloading & Overriding   |
| Abstraction   | Hiding implementation details         | Abstract Class & Interface |

---

## Simple Real-Life Example

Consider a **Car**:

* **Encapsulation:** Car's internal data is protected.
* **Inheritance:** `ElectricCar` can inherit from `Car`.
* **Polymorphism:** Different cars can have different implementations of `start()`.
* **Abstraction:** Driver only uses `start()` without knowing the internal engine mechanism.

---

## Conclusion

The four pillars of OOP make Java programs:

* **Secure** → Encapsulation
* **Reusable** → Inheritance
* **Flexible** → Polymorphism
* **Simple and manageable** → Abstraction

These four concepts are the **foundation of Object-Oriented Programming in Java**.
