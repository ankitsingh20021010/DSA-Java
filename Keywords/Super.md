# Java `super` Keyword

The `super` keyword in Java is used to refer to the **immediate parent class object**.

It is mainly used in **inheritance**.

---

## 1. `super` to Access Parent Class Variable

When the parent and child class have variables with the same name, `super` is used to access the parent class variable.

```java
class Animal {

    String name = "Animal";
}

class Dog extends Animal {

    String name = "Dog";

    void display() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
```

### Output

```text
Dog
Animal
```

Here:

* `name` → Child class variable
* `super.name` → Parent class variable

---

## 2. `super` to Call Parent Class Method

`super` can be used to call a method of the parent class.

```java
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        sound();
        super.sound();
    }
}
```

### Output

```text
Dog barks
Animal makes a sound
```

Here:

```java
super.sound();
```

calls the `sound()` method of the parent class.

---

## 3. `super()` to Call Parent Constructor

`super()` is used to call the constructor of the parent class.

```java
class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog Constructor");
    }
}
```

### Output

```text
Animal Constructor
Dog Constructor
```

`super()` must be the **first statement** inside a constructor.

---

## 4. `super` with Constructor Parameters

We can also pass arguments to the parent constructor.

```java
class Animal {

    Animal(String name) {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
        System.out.println("Dog: " + name);
    }
}
```

### Output

```text
Animal: Tommy
Dog: Tommy
```

---

## `this` vs `super`

| Keyword | Refers to              |
| ------- | ---------------------- |
| `this`  | Current class object   |
| `super` | Immediate parent class |

Example:

```java
this.name;
super.name;
```

`this.name` accesses the current class variable, while `super.name` accesses the parent class variable.

---

## Key Points

* `super` refers to the **immediate parent class**.
* `super.variable` accesses a parent class variable.
* `super.method()` calls a parent class method.
* `super()` calls a parent class constructor.
* `super()` must be the **first statement** in a constructor.

---

### Quick Example

```java
class Parent {

    int number = 10;

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    int number = 20;

    void display() {
        System.out.println("Child: " + this.number);
        System.out.println("Parent: " + super.number);

        super.show();
    }
}
```

### Output

```text
Child: 20
Parent: 10
Parent method
```

> **`super` is used to access members of the immediate parent class.**
