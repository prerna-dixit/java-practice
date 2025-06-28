# Chapter 2: Java Operators – A Complete Demonstration

This folder contains a single Java program that demonstrates the use of **all major types of operators in Java**. It walks through how each operator behaves with examples and outputs, taking user input where needed.

## 📄 File: `useofoperator.java`

### ✅ Operators Covered

#### 1. **Arithmetic Operators**
- **Unary:** Post-Increment (`a++`), Pre-Increment (`++a`), Post-Decrement (`a--`), Pre-Decrement (`--a`)
- **Binary:** Addition (`+`), Subtraction (`-`), Multiplication (`*`), Division (`/`), Modulus (`%`)

#### 2. **Relational Operators**
- Greater than (`>`), Less than (`<`)
- Greater than or equal to (`>=`), Less than or equal to (`<=`)
- Equals to (`==`), Not equal to (`!=`)

#### 3. **Assignment Operators**
- `+=`, `-=`, `*=`, `/=`, `%=` (used to modify the value of a variable based on another value)

#### 4. **Logical Operators**
- AND (`&&`), OR (`||`), NOT (`!`)

#### 5. **Ternary Operator**
- A shorthand `if-else` used to find the maximum of three numbers in this program:
  ```java
  result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);