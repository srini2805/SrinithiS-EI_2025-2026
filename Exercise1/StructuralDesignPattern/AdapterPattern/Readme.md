# Adapter Design Pattern - Payment Gateway Example

## Overview
This project demonstrates the **Adapter Design Pattern** in Java using a **Payment Gateway** scenario.  
The Adapter Pattern allows an interface of a class to be used as another interface that the client expects, enabling incompatible interfaces to work together.  

In this example:
- **Target interface**: `PaymentGateway` – defines a modern payment interface.  
- **Adaptee**: `LegacyPaymentProcessor` – an old payment system that only accepts USD.  
- **Adapter**: `PaymentAdapter` – converts different currencies to USD and delegates payment to the legacy processor.  

---

## Files and Responsibilities

1. **PaymentGateway.java (Target Interface)**  
   - Declares `makePayment(String currency, double amount)`.  
   - Represents the expected payment interface for clients.

2. **LegacyPaymentProcessor.java (Adaptee)**  
   - Simulates an old payment processor that only processes USD payments via `payInUSD(double amount)`.

3. **PaymentAdapter.java (Adapter)**  
   - Implements `PaymentGateway`.  
   - Converts various currencies to USD and uses the `LegacyPaymentProcessor` to make the payment.

4. **Client.java**  
   - Demonstrates the Adapter Pattern in action.  
   - Processes payments in multiple currencies using `PaymentAdapter`.

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
Processing payment of $100.0 through legacy processor.
Processing payment of $110.0 through legacy processor.
Processing payment of $7.0 through legacy processor.
Processing payment of $60.0 through legacy processor.
```

---

## Key Points

* The **Adapter Pattern** allows incompatible interfaces to work together.
* The adapter converts different currencies to USD to use the legacy payment system.
* Adding new payment methods or currencies requires minimal changes, demonstrating flexibility.

---

