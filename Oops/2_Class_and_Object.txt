
===================================================
TOPIC 2: CLASS AND OBJECT
===================================================

1. CLASS KYA HAI?
-------------------
Class ek BLUEPRINT/TEMPLATE hai jisse objects banaye jate hain.
Class khud memory nahi leti - ye sirf design/structure batati hai.

Real life example: "Car" ka DESIGN (naksha) -> Class
                     "Swift", "Creta" -> uss design se bane real cars -> Objects

Class me hote hain:
   - Fields/Variables (data/state)
   - Methods (behavior)
   - Constructors
   - Blocks


2. OBJECT KYA HAI?
--------------------
Object class ka REAL INSTANCE hota hai jo memory (Heap) me store hota hai.
Object ke paas:
   - State  -> variables ki actual values
   - Behavior -> methods jo call ho sakte hain
   - Identity -> unique memory address (reference)

Object banane ka syntax:
   ClassName obj = new ClassName();


3. SYNTAX - CLASS BANANA
---------------------------
class Car {
    // fields (state)
    String brand;
    int speed;

    // method (behavior)
    void drive() {
        System.out.println(brand + " is running at " + speed + " km/h");
    }
}


4. OBJECT CREATE KARNA AUR USE KARNA
----------------------------------------
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();      // object 1 banaya
        car1.brand = "Swift";
        car1.speed = 120;

        Car car2 = new Car();      // object 2 banaya (alag memory)
        car2.brand = "Creta";
        car2.speed = 100;

        car1.drive();    // Output: Swift is running at 120 km/h
        car2.drive();    // Output: Creta is running at 100 km/h
    }
}

NOTE: car1 aur car2 dono alag-alag memory (state) rakhte hain,
lekin dono same Class "Car" ke blueprint se bane hain.


5. CONSTRUCTOR (Object banate waqt automatically chalne wala method)
-----------------------------------------------------------------------
Constructor ek special method hai jo class ke object create hote hi
automatically call hota hai. Iska use object ko initial values dene ke liye hota hai.

Rules:
   - Constructor ka naam class ke naam jaisa hi hota hai
   - Constructor ka koi return type nahi hota (void bhi nahi)

Types of constructor:
   a) Default Constructor  (khud Java deta hai agar hum nahi banate)
   b) No-arg Constructor
   c) Parameterized Constructor

class Car {
    String brand;

    // Parameterized Constructor
    Car(String b) {
        brand = b;
        System.out.println("Constructor called, brand set to: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Swift");   // Constructor automatically call hoga
    }
}


6. "this" KEYWORD
--------------------
"this" current object ko refer karta hai. Mostly use hota hai jab
constructor/method ke parameter aur class variable ka naam same ho.

class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;   // this.brand = current object ka variable
    }                          // brand = parameter (local variable)
}


7. STATIC vs INSTANCE MEMBERS
---------------------------------
INSTANCE (non-static): Har object ka apna alag copy hota hai
STATIC: Sabhi objects me ek hi copy share hoti hai (Class ke saath bandhi hoti hai)

class Counter {
    static int count = 0;   // sabhi objects me shared
    int id;                  // har object ka alag

    Counter() {
        count++;
        id = count;
    }
}


8. INTERVIEW QUICK POINTS
-----------------------------
Q. Class aur Object me kya fark hai?
A. Class ek blueprint/design hai, Object uska real instance hai jo memory leta hai.

Q. Constructor ka use kya hai?
A. Object create hote hi usko initial values (state) dene ke liye.

Q. Kya class memory leti hai?
A. Nahi, sirf Object memory leta hai (Heap me), class sirf structure/design hai.

Q. Default constructor kab milta hai?
A. Agar programmer koi constructor nahi banata to Java khud ek
   empty default constructor provide karta hai.

===================================================
NEXT FILE -> 3_Inheritance.txt
===================================================
