# 🚀 Tthe Fundamentals: Java, OOP, and LLD

This repository is a structured guide to the core pillars of software engineering. It covers **Java** internals, **Object-Oriented Programming (OOP)**, and **Low-Level Design (LLD)** with a focus on writing clean, scalable code.

---

## ☕ 1. Java Essentials
Java is a statically-typed, multi-threaded, and platform-independent language.

### Core Architecture
* **JDK vs JRE vs JVM:**
    * **JDK (Development Kit):** Tools to compile and document Java code.
    * **JRE (Runtime Environment):** Libraries + JVM to run the code.
    * **JVM (Virtual Machine):** Executes bytecode and handles memory.
* **Memory Management:** * **Stack:** Stores primitive types and local variables (LIFO).
    * **Heap:** Stores objects and instance variables; managed by the **Garbage Collector**.

### Key Language Features
* **Collections Framework:** `List` (ArrayList), `Set` (HashSet), `Map` (HashMap), and `Queue`.
* **Java 8+ Features:** * **Lambdas:** Concise functional expressions.
    * **Streams:** Declarative data processing (Filter, Map, Reduce).
    * **Optional:** A container to prevent `NullPointerException`.
* **Multithreading:** Concepts like `ExecutorService`, `CompletableFuture`, and `Synchronized` blocks for concurrency.

---

## 🧱 2. Object-Oriented Programming (OOP)
OOP is the methodology used to design a program using classes and objects.

### The Four Pillars
1.  **Encapsulation:** Wrapping data (variables) and code (methods) together. Use `private` modifiers and getters/setters to protect the state.
2.  **Abstraction:** Hiding implementation details and showing only functionality (e.g., using `interface` or `abstract` classes).
3.  **Inheritance:** One object acquiring properties of a parent object (`extends` keyword). It promotes code reusability.
4.  **Polymorphism:** * **Compile-time:** Method Overloading (same name, different parameters).
    * **Runtime:** Method Overriding (child class provides a specific implementation of a parent method).



---

## 🏗️ 3. Low-Level Design (LLD)
LLD (also known as Object-Oriented Design) focuses on the detailed design of components, class relationships, and logic.

### The SOLID Principles
* **S - Single Responsibility:** A class should have one reason to change.
* **O - Open/Closed:** Open for extension, closed for modification.
* **L - Liskov Substitution:** Subtypes must be substitutable for their base types.
* **I - Interface Segregation:** Don't force clients to depend on methods they don't use.
* **D - Dependency Inversion:** Depend on abstractions, not concretions.

### Class Relationships
* **Association:** A "has-a" relationship (e.g., a Teacher and a Student).
* **Aggregation:** A "weak" has-a relationship (the child can exist without the parent).
* **Composition:** A "strong" has-a relationship (the child cannot exist without the parent).



### Essential Design Patterns
| Type | Patterns | Purpose |
| :--- | :--- | :--- |
| **Creational** | Singleton, Factory, Builder | How objects are created. |
| **Structural** | Adapter, Decorator, Facade | How classes/objects are composed. |
| **Behavioral** | Observer, Strategy, State | How objects communicate. |

---

## 📋 LLD Interview Checklist
When solving an LLD problem (e.g., Design a Parking Lot), follow these steps:
1.  **Clarify Requirements:** List all use cases (e.g., "User can park a car," "System calculates fee").
2.  **Identify Entities:** Define the main classes (e.g., `Vehicle`, `ParkingSlot`, `Ticket`).
3.  **Define Relationships:** Determine how entities interact (e.g., `ParkingLot` *composes* `Levels`).
4.  **Apply Design Patterns:** Use *Factory* for vehicle creation or *Strategy* for pricing logic.
5.  **Write Code:** Implement the classes with proper access modifiers and interfaces.
