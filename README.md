
# 🚀 Java Data Structures Lab – Arrays Module

![Course](https://img.shields.io/badge/DS%20Lab-Week%201-%23ff6f61)
![Language](https://img.shields.io/badge/Java-Source_Code-%23e57373)
![Category](https://img.shields.io/badge/Topic-Arrays-%23ba68c8)
![Level](https://img.shields.io/badge/Level-Beginner%20%2F%20Intro-%2381c784)
![Purpose](https://img.shields.io/badge/Purpose-Teaching-%234fc3f7)

This repository contains all example code used in the Arrays lecture of the Data Structures Lab.
The module focuses on understanding how arrays work in contiguous memory, and why insertion and deletion require shifting elements.

This foundational material prepares students for the upcoming topics: Linked Lists, Stacks, Queues, Trees, BSTs, and Sorting.

---

## 📌 Module Objectives

Students will learn to:

- Understand **memory layout** and why array elements are contiguous
- Use **indexing** to access elements in O(1) time
- Insert elements using **right-shifting**
- Delete elements using **left-shifting**
- Understand the difference between **capacity** and **logical size**
- Recognize why arrays are inefficient for dynamic changes

---

## ▶ Lecture Video

This repository corresponds to the recorded lecture:

[DS Lab: Arrays in Java – Insertion & Deletion Explained](https://www.youtube.com/watch?v=rMp0cFD1jcI)

---

## 📂 Additional Chapter
The file [Lecture 01 - Arrays.pdf](src/arrays/Lecture%2001%20-%20Arrays.pdf) contains extra slides/examples used in the lecture video to illustrate basic array concepts:

- What is an Array?
- Features of Arrays
- Advantages
- Limitations
- Example snippets

Students are encouraged to review and run it alongside `Arrays.java` for practice.

---

## 📁 Repository Structure

```bash
java-ds-lab-arrays/
│
├── src/arrays/
│   ├── Arrays.java              # Demonstration of insertion/deletion using shifting
│   └── Lecture 01 - Arrays.pdf  # Chapter used in the lecture
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

### ✔ Insertion Requires Right-Shifting

To insert at any index, all elements from the end down to that index must move right by one position.

### ✔ Deletion Requires Left-Shifting

To delete an element, all following elements shift left.

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

## ▶ How to Run

Clone the repository:

```bash
git clone https://github.com/Maryam-Skaik/java-ds-lab-arrays.git
```

Open in NetBeans, VS Code, or IntelliJ, then run Arrays.java.

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
