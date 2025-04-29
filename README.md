# 🧠 Understanding Patterns Through the Matrix Concept

Before diving into pattern-building with Java, it's essential to shift your perspective:  
Think of **every pattern as a grid or matrix** — a layout made of rows and columns, like a table.

This mental model helps simplify even the most complex patterns. Once you visualize output as a **2D space**, your job becomes clear:  
Decide **what to print** at each position in that grid — a star, space, number, or letter.

### 📸 Matrix Layout

![Matrix](https://github.com/user-attachments/assets/0a9ddd87-8f05-4e1e-afcd-afeb3bba5297)

---

### 🔍 Why Think in Matrix Terms?

Almost every pattern boils down to two simple decisions:
1. **How many rows?**
2. **What to print in each column of each row? Interger or Space**

By treating it like a matrix:
- You can **loop over rows** using one loop
- And **loop over columns** using another
- And **loop over spaces** using another
- Then apply your logic: "Should I print something here?"

This mindset will allow you to:
- Build basic patterns (like rectangles, triangles)
- Understand hollow, mirrored, or number-based designs
- Master patterns with conditions (`if`, `else`) for shape boundaries.


## 📌 Pattern 1: Solid Rectangle Pattern

### 📃 Description
This Java program prints a **solid rectangle** made of `*` characters using nested loops. It's one of the most basic and essential pattern-building exercises in Java.
![Solid Rectangle Pattern](https://github.com/user-attachments/assets/6a99ddbd-31ef-4e5d-ae0d-3fd44c2dfb6a)



### 🔍 How It Works

- `n = 4` defines the number of rows.
- `m = 5` defines the number of columns.
- The **outer loop** runs `n` times — once for each row.
- The **inner loop** runs `m` times for each row — printing stars in a single line.
- `System.out.print("*")` prints stars side by side.
- `System.out.println()` moves the cursor to the next line after printing each row.

### 💡 Learning Focus

✅ Helps you understand:
- Nested `for` loops  
- Row vs. column logic  
- Basic output formatting with `print` and `println`  
- How loop ranges control shape dimensions

This pattern is often the first step in mastering **2D shapes**, and it's essential for building more complex patterns later.

### ⚙️ Customize It

- Change the `n` and `m` values to make the rectangle larger or smaller.
- Replace `*` with another character like `#`, `$`, or a number.
- Try using `Scanner` to take user input for dynamic pattern generation.

## 📌 Pattern 2: Hollow Rectangle Pattern

### 📃 Description
This program prints a **hollow rectangle** using nested loops and conditional statements. Unlike the solid rectangle, this one only prints stars on the border — leaving the inside empty.
![Hollow Rectangle](https://github.com/user-attachments/assets/b8214e4c-bcf6-4759-8a73-34c58bc76bbf)
### 🔍 How It Works

- `n = 5`: number of rows  
- `m = 4`: number of columns  
- The **outer loop** controls the rows.
- The **inner loop** prints characters in each row.

#### Key Logic:
if (i == 1 || i == n || j == 1 || j == m)
    System.out.print("*");
else
    System.out.print(" ");

Print * only if:

It's the first or last row (i == 1 || i == n)

It's the first or last column (j == 1 || j == m)

Else, print a space

This builds a rectangle that looks solid around the edges but hollow inside.

💡 Learning Focus
✅ Introduces:

Conditional statements inside loops

Logical thinking for shape boundaries

Visualizing grid-based structure more clearly

This is a powerful beginner exercise for mastering control flow within patterns.

⚙️ Customize It
Try changing n and m to create wider/taller rectangles.

Replace * with custom symbols (e.g., #, @)

Nest more conditions inside to explore shapes within shapes.
