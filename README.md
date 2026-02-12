# SOLID Principles in Java

## Project Overview

This repository demonstrates practical implementations of the SOLID Design Principles in Java using structured, real-world inspired examples.

The objective of this project is not just theoretical understanding, but:

- Writing scalable object-oriented code
- Designing loosely coupled systems
- Applying abstraction effectively
- Demonstrating interview-ready architecture knowledge

Each principle includes:

- Violation example (where applicable)
- Correct implementation
- Explanation of design decisions
- Key takeaway for production systems

---

## What is SOLID?

SOLID is a set of five object-oriented design principles introduced by Robert C. Martin (Uncle Bob) that improve software maintainability and scalability.

| Principle | Name |
|-----------|------|
| S | Single Responsibility Principle |
| O | Open/Closed Principle |
| L | Liskov Substitution Principle |
| I | Interface Segregation Principle |
| D | Dependency Inversion Principle |

---

## Project Structure

```
SOLID-Principles/
│
├── 01-SRP/
│   ├── BadImplementation.java
│   └── GoodImplementation.java
│
├── 02-OCP/
│   ├── WithoutOCP.java
│   └── WithOCP.java
│
├── 03-LSP/
│   ├── BankingSystemViolation.java
│   └── BankingSystemCorrected.java
│
├── 04-ISP/
│   ├── FatInterfaceExample.java
│   └── SegregatedInterfacesExample.java
│
├── 05-DIP/
│   ├── TightCouplingExample.java
│   └── DependencyInjectionExample.java
│
└── README.md
```

Each module is isolated for clarity and focused learning.

---

## 1. Single Responsibility Principle (SRP)

A class should have only one reason to change.

### Violation

A single class handling:
- Business logic
- Database operations
- Printing or report generation

### Correct Design

Separated responsibilities into:
- Service class
- Repository class
- Report class

### Engineering Impact

- Improves modularity
- Easier testing
- Clear separation of concerns

---

## 2. Open/Closed Principle (OCP)

Software entities should be open for extension but closed for modification.

### Violation

Using if-else chains when adding new types (e.g., payment modes).

### Correct Design

Used abstraction (interfaces) to allow:
- Extension via new classes
- No modification to existing tested code

### Engineering Impact

- Prevents regression bugs
- Encourages extensible architecture
- Enables scalable system growth

---

## 3. Liskov Substitution Principle (LSP)

Subtypes must be substitutable for their base types.

### Banking System Case Study

Base Class:
- BankAccount

Subclasses:
- SavingsAccount
- CurrentAccount
- FixedDepositAccount

Design constraints handled:

- Method argument rule
- Return type covariance
- Exception handling consistency
- Pre-condition and post-condition rules
- Class invariants
- History constraints

### Engineering Impact

- Safe polymorphism
- Reliable inheritance hierarchy
- Eliminates unexpected runtime failures

---

## 4. Interface Segregation Principle (ISP)

Clients should not be forced to depend on methods they do not use.

### Violation

Large "fat" interface forcing unnecessary implementations.

### Correct Design

Split into:
- Workable
- Eatable
- Sleepable

Classes implement only what they require.

### Engineering Impact

- Cleaner APIs
- Reduced side effects
- High cohesion

---

## 5. Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules. Both should depend on abstractions.

### Violation

High-level class directly instantiating a concrete dependency.

### Correct Design

- Introduced interface abstraction
- Applied dependency injection
- Reduced tight coupling

### Engineering Impact

- Improved testability (mocking support)
- Framework compatibility (Spring-style architecture)
- Flexible system evolution

---

## Technologies Used

- Java 17
- Object-Oriented Programming
- Abstraction and Interfaces
- Exception Handling
- Polymorphism
- Clean Code Practices

---

## Key Learning Outcomes

- Identify design smells
- Refactor violating code
- Structure extensible systems
- Prepare for OOP interviews
- Think like a backend engineer

---

Navigate to any module:

```
cd 01-SRP
javac GoodImplementation.java
java GoodImplementation
```

---

## Interview Relevance

This repository prepares you for:

- Java Backend Interviews
- OOP Design Questions
- System Design Basics
- Low-Level Design (LLD) Rounds
- Code Review Discussions

You will be able to confidently explain:

- Why improper inheritance breaks systems
- How abstraction prevents risky modification
- Why tight coupling reduces scalability

---

## Future Improvements

- Add JUnit test cases
- Convert examples into Spring Boot modules
- Add UML diagrams
- Add real-world microservice examples

---

## Author

Sneha Kumari  
B.Tech CSE (IoT & CS)  
Java and Backend Engineering Enthusiast

