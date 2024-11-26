# Addressing SOLID Principles

## Selected Principles
1. **Single Responsibility Principle (SRP)**: A class should have only one reason to change.
2. **Open/Closed Principle (OCP)**: Classes should be open for extension but closed for modification.
3. **Liskov Substitution Principle (LSP)**: This principle ensures that any class that is the child of a parent class should be usable in place of its parent without any unexpected behavior.

## Use Case
A digital library system with functionality for:
- Managing books (add, delete, etc.)
- Searching books
- Sending overdue notifications.

## How Violations Were Fixed
1. **SRP**: Split book management and notification functionality into separate classes.
2. **OCP**: Used polymorphism to handle different discount types without modifying existing code.
3. **LSP**: Ensured consistent behavior by creating separate classes for `Rectangle` and `Square`.
