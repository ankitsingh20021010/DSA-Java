# Java `implements` Keyword

The `implements` keyword in Java is used by a **class to implement an interface**.

An interface defines methods that a class must provide with their implementation.

---

## 1. Basic Syntax

```java
class ClassName implements InterfaceName {

    // method implementations
}
```

---

## 2. Simple Example

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
    }
}
```

### Output

```text
Dog barks
```

Here:

* `Animal` → Interface
* `Dog` → Class
* `implements` → connects `Dog` with `Animal`
* `sound()` → implemented by `Dog`

---

## 3. Multiple Interfaces

Java does not support multiple inheritance with classes, but a class can implement **multiple interfaces**.

```java
interface Animal {

    void sound();
}

interface Pet {

    void play();
}

class Dog implements Animal, Pet {

    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
```

A class can implement more than one interface by separating them with a comma.

```java
class Dog implements Animal, Pet
```

---

## 4. Interface Methods Must Be Implemented

If an interface contains an abstract method, the implementing class must provide its implementation.

```java
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car started");
    }
}
```

If `Car` does not implement `start()`, the class must be declared `abstract`.

---

## 5. `implements` vs `extends`

| `extends`                         | `implements`                              |
| --------------------------------- | ----------------------------------------- |
| Used for class inheritance        | Used to implement an interface            |
| Class → Class                     | Class → Interface                         |
| Interface → Interface             | Class → Interface                         |
| Supports single class inheritance | A class can implement multiple interfaces |

Example:

```java
class Dog extends Animal
```

```java
class Dog implements Pet
```

---

## 6. `implements` with Multiple Interfaces

```java
interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking photo");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}
```

### Output

```text
Taking photo
Playing music
```

---

## Key Points

* `implements` is used with **interfaces**.
* A class uses `implements` to provide implementations for interface methods.
* A class can implement **multiple interfaces**.
* Interface methods that are abstract must be implemented by the class.
* If the class does not implement all required methods, it must be declared `abstract`.

---

### Quick Example

```java
interface Printable {

    void print();
}

class Document implements Printable {

    public void print() {
        System.out.println("Printing document");
    }
}
```

> **`implements` allows a class to follow the contract defined by an interface.**
