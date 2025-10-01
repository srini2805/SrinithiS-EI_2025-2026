# Factory Design Pattern - Meal Preparation Example

## Overview
This project demonstrates the **Factory Design Pattern** in Java using a **Meal Preparation** scenario.  
The Factory Pattern provides a way to **create objects without exposing the creation logic** to the client and refers to the newly created object using a common interface.

In this example:
- **MealFactory** creates different types of meals based on a string input.  
- **Meal interface** is the product abstraction.  
- Concrete products: **VegMeal** and **NonVegMeal**.  

---

## Files and Responsibilities

1. **Meal.java (Product Interface)**  
   - Declares the `prepare()` method.  
   - Represents a general meal.

2. **VegMeal.java (Concrete Product)**  
   - Implements `Meal`.  
   - Defines `prepare()` for a vegetarian meal.

3. **NonVegMeal.java (Concrete Product)**  
   - Implements `Meal`.  
   - Defines `prepare()` for a non-vegetarian meal.

4. **MealFactory.java (Factory Class)**  
   - Contains `createMeal(String type)` method.  
   - Returns appropriate meal objects (`VegMeal` or `NonVegMeal`) based on input.

5. **Client.java**  
   - Demonstrates the Factory Pattern.  
   - Requests meals from the factory and prepares them.

---

## How to Compile & Run

1. Open a terminal in the folder containing all `.java` files.

2. Compile all files:

```bash
javac *.java
````

3. Run the client program:

```bash
java Client
```

---

## Expected Output

```
Preparing a healthy vegetarian meal.
Preparing a delicious non-vegetarian meal.
```

---

## Key Points

* The **Factory Pattern** separates object creation from the client.
* Adding new meal types only requires adding a new class and updating the factory.
* Promotes **flexibility**, **scalability**, and **clean code** in real-world applications like meal preparation, document creation, or notification systems.

---



