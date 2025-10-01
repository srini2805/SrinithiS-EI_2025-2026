# Satellite Command System - Java Project

## Overview
This project demonstrates a **Satellite Command System** implemented in Java.  
It simulates a satellite mission, including orbit management, data collection, rotation, and solar panel control.  
The system applies **OOP best practices**, the **Command Pattern**, **Singleton Logger**, and **clean code organization**.

The mission includes:
- Rotating the satellite in four directions (N, E, S, W)
- Activating/deactivating solar panels
- Collecting data with transient error handling
- Advancing through seven orbits
- Logging mission events

---

## Features

1. **Command Pattern**  
   - Encapsulates satellite actions as commands (`RotateCommand`, `SetPanelsCommand`, `CollectDataCommand`, `AdvanceOrbitCommand`).  
   - Executes commands via `CommandExecutor`.

2. **Singleton Logger**  
   - `LoggerService` ensures consistent logging across the system.

3. **Orbit Rules & Management**  
   - `OrbitRules` enforces conditions for advancing to the next orbit.  
   - `OrbitManager` manages daily rotation limits.

4. **Satellite Behavior**  
   - Tracks orientation, panel status, data collected, and orbit-specific statistics.  
   - Handles transient errors if panels remain inactive for consecutive turns.

5. **User Interaction**  
   - Input-based simulation: users enter rotation directions and panel activation per day.

---

## Files and Responsibilities

- **Direction.java** – Enum for directions with string conversion.  
- **LoggerService.java** – Singleton logger for info and error messages.  
- **Satellite.java** – Core satellite behavior, state tracking, and mission summary.  
- **OrbitManager.java** – Tracks rotations and day limits.  
- **OrbitRules.java** – Defines rules for orbit advancement.  
- **Command.java** – Command interface.  
- **RotateCommand.java, SetPanelsCommand.java, CollectDataCommand.java, AdvanceOrbitCommand.java** – Concrete commands implementing satellite actions.  
- **CommandExecutor.java** – Executes commands safely with exception handling.  
- **SatelliteCommandSystem.java** – Main program and client interface for mission simulation.

---

## How to Compile & Run

1. Open a terminal in the folder containing all `.java` files.

2. Compile all files:

```bash
javac *.java
````

3. Run the main program:

```bash
java SatelliteCommandSystem
```

4. Follow the prompts to:

   * Enter rotation directions (N/E/S/W)
   * Activate or deactivate solar panels (y/n)
   * Collect data and progress through orbits

---

## Example Output

```
Starting Satellite Mission...
Orbit 1 begins.
Enter direction (N/E/S/W): N
Orientation: NORTH in orbit 1
Activate solar panels? (y/n): y
Solar panels: Active
Data Collected: 10
...
================== MISSION COMPLETE ==================
Reached Mars Successfully
Total Data Collected: 350 units
Total Active States: 20
Total Inactive States: 5
North Rotations: 15
South Rotations: 5
East Rotations: 3
West Rotations: 2

--- Data Collected per Orbit ---
Orbit 1: 50 units
Orbit 2: 40 units
...
======================================================
```

---

## Key Points

* **Command Pattern** decouples user actions from satellite behavior.
* **Singleton Logger** ensures centralized, consistent logging.
* Modular class structure supports maintainability and scalability.
* Simulates real-world satellite mission scenarios with error handling, rotations, and data collection.

---

