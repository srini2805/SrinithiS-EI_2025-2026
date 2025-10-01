# Singleton Design Pattern - Printer Manager Example

## Overview
This project demonstrates the **Singleton Design Pattern** in Java.  
The Singleton Pattern ensures that a class has **only one instance** and provides a **global point of access** to that instance.  

In this example:
- `PrinterManager` ensures only **one printer manager** exists.
- Multiple clients can use the same instance to print documents.

---

## Files and Responsibilities

1. **PrinterManager.java**  
   - Implements the Singleton pattern using **eager initialization**.  
   - Private constructor prevents external instantiation.  
   - `getInstance()` provides global access to the single instance.  
   - `printDocument(String documentName)` simulates printing a document.

2. **Client.java**  
   - Demonstrates using the Singleton `PrinterManager`.  
   - Obtains multiple references to the singleton instance and prints documents.  
   - Verifies that all references point to the same instance.

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
Printing: Resume.pdf
Printing: Report.docx
Both clients use the same PrinterManager instance!
```

---

## Key Points

* **Singleton ensures a single instance** across the application.
* Provides a **global point of access** (`getInstance()`).
* Useful for shared resources such as printers, configuration managers, or logging systems.

---


