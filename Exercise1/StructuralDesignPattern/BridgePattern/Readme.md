# Bridge Design Pattern - Robot Control System

## Overview
This project demonstrates the **Bridge Design Pattern** in Java using a **Robot Control System** scenario.  
The Bridge Pattern decouples an abstraction from its implementation, allowing them to vary independently.  

In this example:
- **Abstraction**: Robot behavior (e.g., cleaning, delivery).  
- **Implementation**: Control methods (e.g., smartphone app, voice assistant, joystick).  

This allows adding new robot types or control mechanisms without modifying existing code.

---

## Files and Responsibilities

1. **Robot.java (Abstraction)**
   - Abstract class representing a robot.  
   - Holds a reference to a `ControlInterface`.  
   - Defines `performTask(String task)` as the main operation.

2. **ControlInterface.java (Implementor)**
   - Interface defining `sendCommand(String command)`.  
   - Acts as the control mechanism for robots.

3. **CleaningRobot.java (Refined Abstraction)**
   - Subclass of `Robot`.  
   - Implements `performTask` to perform cleaning tasks.

4. **DeliveryRobot.java (Refined Abstraction)**
   - Subclass of `Robot`.  
   - Implements `performTask` to perform delivery tasks.

5. **VoiceAssistantControl.java (Concrete Implementor)**
   - Implements `ControlInterface`.  
   - Simulates sending commands via a voice assistant.

6. **JoystickControl.java (Concrete Implementor)**
   - Implements `ControlInterface`.  
   - Simulates sending commands via a joystick.

7. **BridgeRobotDemo.java (Client / Demo)**
   - Demonstrates creating robots with different control mechanisms.  
   - Shows flexibility of the Bridge Pattern in real-world scenarios.

---

## How to Compile & Run

1. Open a terminal in the project folder containing all `.java` files.

2. Compile all files:

```bash
javac *.java
````

3. Run the demo:

```bash
java BridgeRobotDemo
```

---

## Expected Output

```
Voice Assistant executes: Cleaning: Start Carpet Cleaning
Joystick triggers: Delivering: Deliver Parcel to Unit 305
```

---

## Key Points

* The **abstraction (Robot)** and **implementation (ControlInterface)** are decoupled.
* New robot types or control methods can be added **independently**.
* Demonstrates real-world flexibility, showing the **Bridge Pattern** benefits.

