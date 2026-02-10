# S1.08 — Lambdas and Streams

## 🎯 Objectives
This project aims to practice the use of Lambda expressions, the Streams API, and Functional Interfaces in Java 8+, focusing on writing declarative and efficient code.

## 📌 Level 1

✅The goal is to solve a series of exercises of increasing complexity to gain fluency in functional programming paradigms. The exercises include filtering collections, using method references, creating custom functional interfaces, and sorting data based on various criteria.

- **Exercise 1 & 2**: Filtering String lists using multiple predicates (content and length) with the Streams API.
- **Exercise 3 & 4**: Iterating and printing collections using Lambdas and Method References.
- **Exercise 5**: Defining and instantiating custom Functional Interfaces (Pi value supplier).
- **Exercise 6 & 7**: Sorting mixed-type lists using custom Comparators and length logic.
- **Exercise 8**: Implementing string reversal logic through a custom Functional Interface.

## 🛠 Technologies

- Java 21 
- IntelliJ IDEA
- Git & GitHub

## 🚀 Installation and Execution

1. **📂Clone the repository**:
   `git clone https://github.com/carlasalmeron/S1.08-Lambdas-and-Streams.git`
2. **Setup environment**: Ensure you have Java 17 or higher installed. No specific `.env` variables are required for this project.
3. **Run the application**:
   Since `mvn` might not be in your global PATH, you can use the manual compilation command from the root folder:
   ```cmd
   javac -d bin src/main/java/Level1/*.java
   java -cp bin Level1.Exercise1
   ```
   If you have Maven installed:
   ```bash
   mvn clean compile
   mvn exec:java -Dexec.mainClass="Level1.Exercise1"
   ```
4. **Tests**: Manual verification via the `Main` methods in each exercise class.
