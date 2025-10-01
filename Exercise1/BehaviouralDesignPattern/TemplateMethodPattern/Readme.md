# Template Method Pattern - Workout Routine

## Overview
The **Template Method Pattern** defines the skeleton of an algorithm in a base class, allowing subclasses to implement specific steps.  
In this project, the algorithm is a **workout routine**: warm-up → main exercise → cool-down. The **main exercise** step is implemented by subclasses.

## Files
- **WorkoutRoutine.java**: Abstract class with template method `performRoutine()`. Implements common steps (`warmUp`, `coolDown`) and declares abstract `mainExercise()`.
- **CardioWorkout.java**: Subclass implementing `mainExercise()` as 20 minutes of running.
- **StrengthWorkout.java**: Subclass implementing `mainExercise()` as 15 minutes of weight training.
- **Client.java**: Client code demonstrating the pattern by performing cardio and strength routines.

## How to Run
1. Compile all files:
```bash
javac *.java
