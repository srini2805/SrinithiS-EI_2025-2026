# Template Method Pattern - Workout Routine

## Overview
This project demonstrates the **Template Method Design Pattern** in Java.  
The Template Method Pattern defines the **skeleton of an algorithm** in a base class, allowing subclasses to override specific steps without changing the overall structure.

In this example, the algorithm is a **workout routine**:
1. Warm-up
2. Main exercise (defined by subclasses)
3. Cool-down

---

## Files and Responsibilities

1. **WorkoutRoutine.java (Abstract Class)**  
   - Contains the template method `performRoutine()`.  
   - Implements common steps: `warmUp()` and `coolDown()`.  
   - Declares abstract `mainExercise()` for subclasses.

2. **CardioWorkout.java (Concrete Subclass)**  
   - Implements `mainExercise()` as **20 minutes of running**.

3. **StrengthWorkout.java (Concrete Subclass)**  
   - Implements `mainExercise()` as **15 minutes of weight training**.

4. **Client.java**  
   - Demonstrates the Template Method pattern.  
   - Creates instances of `CardioWorkout` and `StrengthWorkout` and executes routines.

---

## How to Compile & Run

1. Open a terminal in the folder containing the `.java` files.

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
Cardio Routine:
Warming up: 5 minutes of stretching
Main Exercise: 20 minutes of running
Cooling down: 5 minutes of slow walking

Strength Routine:
Warming up: 5 minutes of stretching
Main Exercise: 15 minutes of weight training
Cooling down: 5 minutes of slow walking
```

---

## Key Points

* **Template Method** (`performRoutine`) defines the fixed steps of an algorithm.
* Subclasses override only the variable step (`mainExercise`).
* Promotes **code reuse**, **flexibility**, and **maintains consistent algorithm flow**.

---


