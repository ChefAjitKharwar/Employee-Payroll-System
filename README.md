Employee Payroll System

A simple **Java console application** to manage employees and calculate their salaries.
The system supports both **Full-Time** and **Part-Time** employees and provides features to add, remove, and display employees.

---

## ✨ Features

✅ Add full-time employees with fixed monthly salary
✅ Add part-time employees with hourly rate and hours worked
✅ Remove employees by their ID
✅ Display the list of employees with their details and calculated salary
✅ Demonstrates **abstraction**, **inheritance**, and **polymorphism** in Java OOP

---

## 🛠️ Technologies Used

* Java
* OOP principles:

  * Abstract classes
  * Inheritance
  * Method overriding
  * Encapsulation
* ArrayList for storing employee records

---

## 📂 Project Structure

```
Employee Payroll System/
├── Main.java                # Main program entry point
├── Employee.java            # Abstract class defining employee blueprint
├── FullTimeEmployee.java    # Full-time employee implementation
├── PartTimeEmployee.java    # Part-time employee implementation
├── PayrollSystem.java       # Manages list of employees
├── README.md                # This file
```

---

## 🚀 How to Run

### Prerequisites

* Install Java JDK (8 or higher)
* Set up `javac` and `java` in your PATH

### Steps

1️⃣ Clone this repository:

```bash
git clone https://github.com/ChefAjitKharwar/Employee-Payroll-System.git
cd Employee-Payroll-System
```

2️⃣ Compile the Java files:

```bash
javac Main.java
```

3️⃣ Run the program:

```bash
java Main
```

---

## 🧪 Sample Output

```
Initial Employee Details: 
Employee[name = Ajit , id = 1 , salary = 70000.0]
Employee[name = Ankit , id = 2 , salary = 4000.0]

Removing Employees

Remaining Employee Details: 
Employee[name = Ajit , id = 1 , salary = 70000.0]
```

---

## 📖 Concepts Demonstrated

* Abstract class `Employee` with an abstract method `calculateSalary()`.
* Two subclasses:

  * `FullTimeEmployee`: Salary is a fixed monthly amount.
  * `PartTimeEmployee`: Salary is computed as `hoursWorked * hourlyRate`.
* A `PayrollSystem` class that maintains a list of employees and provides operations to manage them.

---

## 📌 Improvements / To-Do

🔷 Add persistence (e.g., save/load data from a file or database).
🔷 Add more employee types (e.g., Contract).
🔷 Add a menu-driven UI instead of hard-coded test data.
🔷 Write unit tests for each functionality.

---

## 👤 Author

* [ChefAjitKharwar](https://github.com/ChefAjitKharwar)

---
