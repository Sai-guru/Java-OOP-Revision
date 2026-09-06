# Java OOP Study Guide

This folder contains small Java examples for typing and practice. Study them
in the order below. Each topic has a `.txt` reference file containing the full
example and an empty `.java` file where you can type the code yourself.

## Recommended study order

### 1. Java object basics

Start with the ideas that everything else depends on:

1. [Class](./class/ClassExample.txt) - [practice Java file](./class/ClassExample.java)
2. [Object](./object/ObjectExample.txt) - [practice Java file](./object/ObjectExample.java)
3. [`new` keyword](./new-keyword/NewKeywordExample.txt) - [practice Java file](./new-keyword/NewKeywordExample.java)
4. [Constructor](./constructor/ConstructorExample.txt) - [practice Java file](./constructor/ConstructorExample.java)
5. [`this` keyword](./this-keyword/ThisKeywordExample.txt) - [practice Java file](./this-keyword/ThisKeywordExample.java)
6. [`this()` constructor call](./this-constructor/ThisConstructorExample.txt) - [practice Java file](./this-constructor/ThisConstructorExample.java)

### 2. Protecting and managing object data

Learn how classes control their state:

7. [Encapsulation](./encapsulation/EncapsulationExample.txt) - [practice Java file](./encapsulation/EncapsulationExample.java)
8. [Getter](./getter/GetterExample.txt) - [practice Java file](./getter/GetterExample.java)
9. [Setter](./setter/SetterExample.txt) - [practice Java file](./setter/SetterExample.java)
10. [Access modifiers](./access-modifiers/AccessModifiersExample.txt) - [practice Java file](./access-modifiers/AccessModifiersExample.java)
11. [Static keyword](./static-keyword/StaticKeywordExample.txt) - [practice Java file](./static-keyword/StaticKeywordExample.java)
12. [`final` keyword](./final-keyword/FinalKeywordExample.txt) - [practice Java file](./final-keyword/FinalKeywordExample.java)

### 3. Reusing and extending classes

Study these together because they are closely related:

13. [Inheritance](./inheritance/InheritanceExample.txt) - [practice Java file](./inheritance/InheritanceExample.java)
14. [`super` keyword](./super-keyword/SuperKeywordExample.txt) - [practice Java file](./super-keyword/SuperKeywordExample.java)
15. [Method overloading](./overloading/OverloadingExample.txt) - [practice Java file](./overloading/OverloadingExample.java)
16. [Method overriding](./overriding/OverridingExample.txt) - [practice Java file](./overriding/OverridingExample.java)
17. [Polymorphism](./polymorphism/PolymorphismExample.txt) - [practice Java file](./polymorphism/PolymorphismExample.java)
18. [Abstraction](./abstraction/AbstractionExample.txt) - [practice Java file](./abstraction/AbstractionExample.java)
19. [Interfaces](./interfaces/InterfaceExample.txt) - [practice Java file](./interfaces/InterfaceExample.java)
20. [Four pillars of OOP](./4-pillars/FourPillarsExample.txt) - [practice Java file](./4-pillars/FourPillarsExample.java)

### 4. Relationships between objects

These explain different kinds of object collaboration:

21. [Association](./association/AssociationExample.txt) - [practice Java file](./association/AssociationExample.java)
22. [Aggregation](./aggregation/AggregationExample.txt) - [practice Java file](./aggregation/AggregationExample.java)
23. [Composition](./composition/CompositionExample.txt) - [practice Java file](./composition/CompositionExample.java)

### 5. Useful Java language features

Learn these after the OOP fundamentals:

24. [Enum](./enum/EnumExample.txt) - [practice Java file](./enum/EnumExample.java)
25. [Nested classes](./nested-class/NestedClassExample.txt) - [practice Java file](./nested-class/NestedClassExample.java)
26. [Object class methods](./object-class/ObjectClassExample.txt) - [practice Java file](./object-class/ObjectClassExample.java)
27. [Generics](./generics/GenericsExample.txt) - [practice Java file](./generics/GenericsExample.java)
28. [Exception handling](./exception-handling/ExceptionHandlingExample.txt) - [practice Java file](./exception-handling/ExceptionHandlingExample.java)
29. [Multi-threading](./multithreading/MultiThreadingExample.txt) - [practice Java file](./multithreading/MultiThreadingExample.java)

## How to study each file

For every example:

1. Open the `.txt` file and read the explanation comment at the top.
2. Open the matching empty `.java` file.
3. Type the code yourself without copy/paste.
4. Read the fields, constructors, and methods as you type.
5. Run your completed Java file and compare the output.
6. Change one value or method and run it again.
7. Explain the example in your own words before moving on.

The `.txt` files are your reference copies. The `.java` files are intentionally
empty practice files and have not been removed.

## Compile all examples

The original examples have been moved to `.txt` reference files, so first
complete the matching `.java` files. Then, from this `oops` folder:

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
