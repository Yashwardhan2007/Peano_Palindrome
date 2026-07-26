# Peano Palindrome

A Java project implementing Peano Numbers and Palindrome Checker with both recursive and iterative approaches.

## 📋 Project Overview

This project contains two main classes demonstrating different algorithmic approaches:

### 1. **PeanoNumber Class**
Implements Peano number operations (Peano axioms system for representing natural numbers).

**Features:**
- ✅ Convert integers to Peano numbers
- ✅ Convert Peano numbers back to integers
- ✅ Add two Peano numbers
- ✅ Multiply two Peano numbers
- ✅ Both **recursive** and **iterative** implementations

**Example:**
```
Integer 3 → Peano: S(S(S(0)))
Peano S(S(0)) + S(S(S(0))) → S(S(S(S(S(0))))) (5)
```

### 2. **PalindromeChecker Class**
Checks if arrays form palindromes using two different approaches.

**Features:**
- ✅ Check if array is palindrome (recursive method)
- ✅ Check if array is palindrome (iterative method)
- ✅ Works with any comparable data type

**Example:**
```
[1, 2, 3, 2, 1] → True (palindrome)
[1, 2, 3, 4, 5] → False (not palindrome)
```

## 🚀 How to Run

### Compile:
```bash
javac PeanoNumber.java PalindromeChecker.java
```

### Run (with main method):
```bash
java PeanoNumber
java PalindromeChecker
```

## 💡 Key Concepts Demonstrated

- **Recursive vs Iterative Approaches** - Performance and readability comparison
- **Peano Axioms** - Mathematical foundations of natural numbers
- **Array Manipulation** - Two-pointer technique for palindrome checking
- **Data Structure Design** - Custom representation of numbers

## 📝 Methods Overview

### PeanoNumber
- `intToPeano(int n)` - Convert integer to Peano representation
- `peanoToInt(PeanoNumber p)` - Convert Peano to integer
- `add(PeanoNumber a, PeanoNumber b)` - Addition (recursive & iterative)
- `multiply(PeanoNumber a, PeanoNumber b)` - Multiplication (recursive & iterative)

### PalindromeChecker
- `isPalindromeRecursive(int[] arr)` - Recursive palindrome check
- `isPalindromeIterative(int[] arr)` - Iterative palindrome check

## 🎓 Learning Outcomes

This project demonstrates understanding of:
- Recursive algorithm design
- Iterative optimization
- Mathematical number systems
- Array algorithms
- Clean code practices

---

**Author:** Yashwardhan2007  
**Course:** University Assignment
