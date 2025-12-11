
<h1 align="center">🚀 Java Data Structures Lab – Arrays Module</h1>

![Course](https://img.shields.io/badge/DS%20Lab-Week%201-%23ff6f61)
![Language](https://img.shields.io/badge/Java-Source_Code-%23e57373)
![Category](https://img.shields.io/badge/Topic-Arrays-%23ba68c8)
![Level](https://img.shields.io/badge/Level-Beginner%20%2F%20Intro-%2381c784)
![Purpose](https://img.shields.io/badge/Purpose-Teaching-%234fc3f7)

This repository contains all example code, lecture material, and student activities for the **Arrays Module** of the Java Data Structures Lab.  
The module focuses on understanding how arrays store data in contiguous memory, and why operations such as insertion and deletion require **shifting elements**.

This content prepares students for upcoming structures: **Linked Lists, Stacks, Queues, Trees, BSTs, and Sorting**.

---

## 📌 Module Objectives

Students will learn to:

- How arrays occupy **contiguous memory**
- Why indexing provides **O(1)** access time
- How to perform **insertion using right-shifting**
- How to perform **deletion using left-shifting**
- The difference between **capacity vs. logical size**
- Why arrays are inefficient for dynamic data changes

---

## ▶ Lecture Video

This repository corresponds to the recorded lecture:

[DS Lab: Arrays in Java – Insertion & Deletion Explained](https://www.youtube.com/watch?v=rMp0cFD1jcI)

---

## 📚 Lecture Chapter (PDF)

Additional slides used during the lecture:
**[Lecture 01 - Arrays.pdf](src/arrays/Lecture%2001%20-%20Arrays.pdf)**

Includes:

- What is an Array?
- Features of Arrays
- Advantages
- Limitations
- Example used in lecture  
- Notes for students

Students are encouraged to review and run it alongside `Arrays.java` for practice.

---

## 📁 Repository Structure

```bash
java-ds-lab-arrays/
│
├── src/
│   ├── examples/                 # Lecture example code
│   │   └── Arrays.java
│   │
│   ├── activities/               # Practice problems with solutions
│   │   ├── LargestandSmallest.java   # Find largest/smallest value and index
│   │   └── RotateLeft.java            # Rotate array left (shifting + reverse method)
│   │
│   └── chapters/                 # Lecture chapters (PDF)
│       └── Lecture 01 - Arrays.pdf
│
├── assignments/                  # Assignment descriptions & future solutions
│   └── README.md
│
└── README.md
```

---

## 💡 Key Concepts Demonstrated

### ✔ Contiguous Memory Layout

Arrays store elements sequentially in memory.
This enables **O(1) direct access** using the formula:

```bash
address(arr[i]) = base_address + (i * element_size)
```

> This provides **constant-time access**.

---

### 🖼 Array Memory Visualization

```mermaid
flowchart LR
    style A fill:#ffcccc,stroke:#ff0000,stroke-width:2px,color:#000000
    style B fill:#ccffcc,stroke:#00cc00,stroke-width:2px,color:#000000
    style C fill:#cce0ff,stroke:#0066ff,stroke-width:2px,color:#000000
    style D fill:#fff0b3,stroke:#e6b800,stroke-width:2px,color:#000000
    style E fill:#ffccff,stroke:#cc00cc,stroke-width:2px,color:#000000

    A["arr[0]=1"] --> B["arr[1]=2"] --> C["arr[2]=5"] --> D["arr[3]=0"] --> E["arr[4]=0"]
```

---

### ✔ Manual Shifting for Insertion

To insert at index i, elements from the end down to i must shift right:

```mermaid
flowchart LR
    style Insert fill:#ffe0b3,stroke:#e68a00,stroke-width:2px,color:#000000
    style ShiftRight fill:#ccffcc,stroke:#00cc00,stroke-width:2px,color:#000000
    style Result fill:#cce0ff,stroke:#0066ff,stroke-width:2px,color:#000000

    Insert["Insert 7 at index 1"] --> ShiftRight["Shift elements right from index 1"]
    ShiftRight --> Result["Result: [1,7,2,5,0]"]
```

---

### ✔ Manual Shifting for Deletion

To delete at index i, elements shift left:

```mermaid
flowchart LR
    style Delete fill:#ffcccc,stroke:#ff0000,stroke-width:2px,color:#000000
    style ShiftLeft fill:#ccffcc,stroke:#00cc00,stroke-width:2px,color:#000000
    style ResultDel fill:#cce0ff,stroke:#0066ff,stroke-width:2px,color:#000000

    Delete["Delete element at index 1"] --> ShiftLeft["Shift elements left from index 1"]
    ShiftLeft --> ResultDel["Result: [1,2,5,0,0]"]
```

---

## 🖼 Diagram: How Arrays Sit in Memory

Example: An `int[]` stored in contiguous memory, assuming each `int = 4 bytes`.

Base address = 2000

```bash
+-----------+-----------+-----------+-----------+-----------+
|  arr[0]   |  arr[1]   |  arr[2]   |  arr[3]   |  arr[4]   |
+-----------+-----------+-----------+-----------+-----------+
    2000        2004        2008        2012        2016
```

Access:

```bash
arr[0] → address 2000
arr[1] → address 2000 + 4 = 2004
arr[2] → address 2000 + 8 = 2008
```

Insertion at index 1 shifts all elements to the right:

```bash
Before:  [1, 2, 5, 0, 0]
Insert 7 at index 1
Shift →  [1, 2, 2, 5, 0]
Result → [1, 7, 2, 5, 0]
```

Deletion shifts left:

```bash
Before delete index 1: [1, 7, 2, 5, 0]
After shifting →        [1, 2, 5, 0, 0]
```

---

## 📘 Code Explanation

This project contains two core methods:

### ⭐ `insertElement(int[] arr, int element, int index, int size)`

- Rejects insertion if the array is full
- Validates index
- Shifts elements right
- Inserts the new value into its correct place

This demonstrates why static arrays cannot dynamically expand.

---

### ⭐ `deleteElement(int[] arr, int index, int size)`

- Validates index
- Shifts all elements left from the deleted position
- Clears the last logical element (`0`)

This shows logical deletion while keeping the fixed array structure intact.

---

## ▶ Example Execution

The `main` method demonstrates:

- Initializing an array
- Inserting a value
- Deleting a value
- Printing before/after states

This provides a full walkthrough of manual shifting operations.

---

## 📘 Activities (with Solutions)

The `[activities/](src/activities)` folder includes practice problems solved in class.

### ⭐ Activity 01 – Largest & Smallest Element

File: [src/activities/LargestandSmallest.java](src/activities/LargestandSmallest.java)

Demonstrates:

- Basic traversal
- Conditional selection
- Tracking indices of key values

---

### ⭐ Activity 02 – Rotate Array Left by 1 (Multiple Techniques)

File: [src/activities/RotateLeft.java](src/activities/RotateLeft.java)

Techniques shown:

- Shifting-based rotation (core arrays lesson)
- Using delete/insert logic
- Reverse-based rotation (faster O(n) approach)

> The reverse method is included for completeness but is not the primary focus of the Arrays module.

---

## ▶ Activity Solutions Video

Watch the Activity Solutions video for a detailed, step-by-step walkthrough of how to solve the activities from this module. The video explains the solutions for the problems covered in the Activities 01 & 02.

[Activity Solutions – Arrays Lecture (Largest & Smallest Elements, Rotate Left)](https://youtu.be/f2lLdk3ZZKc?si=j0E_b314OcoUVfvB)

---

## ▶ How to Run

Clone the repository:

```bash
git clone https://github.com/Maryam-Skaik/java-ds-lab-arrays.git
```

Open in NetBeans, VS Code, or IntelliJ, then run any file inside [src/examples/](src/examples/) or [src/activities/](src/activities/).

---

## 🎓 Learning Outcome

Students will understand:

- Why arrays require shifting
- Why many applications prefer **Linked Lists** for dynamic operations
- The difference between **physical size** (capacity) and **logical size**
- How memory layout influences data structure selection

These concepts are critical for success in the rest of the DS course.

---

## 📝 License

This project is provided for educational use in the Data Structures Lab.
