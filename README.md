# Java OOP Study Guide

This folder contains small, runnable Java examples. Study them in the order
below. Every topic has an explanation at the top of its `.java` file.

## Recommended study order

### 1. Java object basics

Start with the ideas that everything else depends on:

1. [Class](./class/ClassExample.java)
2. [Object](./object/ObjectExample.java)
3. [`new` keyword](./new-keyword/NewKeywordExample.java)
4. [Constructor](./constructor/ConstructorExample.java)
5. [`this` keyword](./this-keyword/ThisKeywordExample.java)
6. [`this()` constructor call](./this-constructor/ThisConstructorExample.java)

### 2. Protecting and managing object data

Learn how classes control their state:

7. [Encapsulation](./encapsulation/EncapsulationExample.java)
8. [Getter](./getter/GetterExample.java)
9. [Setter](./setter/SetterExample.java)
10. [Access modifiers](./access-modifiers/AccessModifiersExample.java)
11. [Static keyword](./static-keyword/StaticKeywordExample.java)
12. [`final` keyword](./final-keyword/FinalKeywordExample.java)

### 3. Reusing and extending classes

Study these together because they are closely related:

13. [Inheritance](./inheritance/InheritanceExample.java)
14. [`super` keyword](./super-keyword/SuperKeywordExample.java)
15. [Method overloading](./overloading/OverloadingExample.java)
16. [Method overriding](./overriding/OverridingExample.java)
17. [Polymorphism](./polymorphism/PolymorphismExample.java)
18. [Abstraction](./abstraction/AbstractionExample.java)
19. [Interfaces](./interfaces/InterfaceExample.java)
20. [Four pillars of OOP](./4-pillars/FourPillarsExample.java)

### 4. Relationships between objects

These explain different kinds of object collaboration:

21. [Association](./association/AssociationExample.java)
22. [Aggregation](./aggregation/AggregationExample.java)
23. [Composition](./composition/CompositionExample.java)

### 5. Useful Java language features

Learn these after the OOP fundamentals:

24. [Enum](./enum/EnumExample.java)
25. [Nested classes](./nested-class/NestedClassExample.java)
26. [Object class methods](./object-class/ObjectClassExample.java)
27. [Generics](./generics/GenericsExample.java)
28. [Exception handling](./exception-handling/ExceptionHandlingExample.java)
29. [Multi-threading](./multithreading/MultiThreadingExample.java)

## How to study each file

For every example:

1. Read the explanation comment at the top.
2. Read the fields and constructors.
3. Read each method and predict its output.
4. Read the `main` method.
5. Run the example.
6. Change one value or method and run it again.
7. Explain the example in your own words before moving on.

## Compile all examples

From this `oops` folder:

```bash
mkdir -p out
find . -name "*.java" -print0 | xargs -0 javac -d out
```

## Run one example

Use the class name, not the folder name:

```bash
java -cp out ObjectExample
java -cp out FourPillarsExample
java -cp out MultiThreadingExample
```

## Important relationships to remember

| Concept | Simple meaning |
| --- | --- |
| Class | Blueprint |
| Object | Instance created from a class |
| Encapsulation | Protecting data through controlled methods |
| Inheritance | Child class reusing a parent class |
| Polymorphism | Same reference behaving differently |
| Abstraction | Showing essential behavior and hiding details |
| Interface | Contract that a class agrees to follow |
| Composition | Strong `has-a` relationship |
| Aggregation | Weak `has-a` relationship |
| Association | Independent objects communicating |

## Suggested milestone order

- **Milestone 1:** Finish topics 1-6 and create your own `Student` class.
- **Milestone 2:** Finish topics 7-12 and validate fields with getters/setters.
- **Milestone 3:** Finish topics 13-20 and build a small payment hierarchy.
- **Milestone 4:** Finish topics 21-23 and model a school or shopping system.
- **Milestone 5:** Finish topics 24-29 and add collections, errors, and threads.

