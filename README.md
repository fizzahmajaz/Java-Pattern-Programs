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

### 💡 Learning Focus

Conditional statements inside loops

Logical thinking for shape boundaries

Visualizing grid-based structure more clearly

This is a powerful beginner exercise for mastering control flow within patterns.

### ⚙️ Customize It
Try changing n and m to create wider/taller rectangles.

Replace * with custom symbols (e.g., #, @)

Nest more conditions inside to explore shapes within shapes.


## 📌 Pattern 3: Half Pyramid Pattern

### 📃 Description
This pattern creates a **left-aligned half pyramid** using stars (`*`). Each row adds one more star than the previous, forming a triangle aligned to the left.
![Half Pyramid Pattern](https://github.com/user-attachments/assets/613f2374-5b46-4065-b9fa-21a449605313)

### 🔍 How It Works

- `n = 5`: The maximum number of rows (but `i` starts at 0).
- The **outer loop** runs through each row.
- The **inner loop** runs from 0 up to `i`, printing a `*` for each iteration.

#### Loop Breakdown:
for (int i = 0; i <= n; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

Example Breakdown:
i = 0 → 1 star

i = 1 → 2 stars

i = 2 → 3 stars

…

i = 5 → 6 stars

Each row increases by one star.

💡 Learning Focus
✅ This pattern helps you understand:

Nested loops where one loop's counter affects the other's range.

Row-wise incremental growth in output.

Simple control flow using loop conditions.

🛠 Customization Ideas
Modify n to change the height of the pyramid.

Use numbers (1, 2, etc.) instead of * for number-based pyramids.

Try mirroring or inverting the pyramid for new challenges.

## 📌 Pattern 4: Inverted Half Pyramid

![Inverted HALF  PYRAMID](https://github.com/user-attachments/assets/b25a40f9-2671-46ff-89b6-cadf4fc5d802)



### 📃 Description

This pattern prints an **inverted half pyramid** — a reversed version of the regular half pyramid we saw earlier.  
Instead of starting with one star and increasing, this pattern starts with the **maximum number of stars** and decreases with each row.

It’s helpful for beginners to understand how **control flow** changes the direction of a pattern simply by adjusting the loop variables.

---

### 🔁 What's Different?

In the **Half Pyramid**, we looped from `i = 0` to `n`, and the number of stars increased with each row.  
In the **Inverted Half Pyramid**, we do the opposite:

- The loop starts from `i = n` and goes down to `i = 1`.
- The number of stars **decreases** with each row.
- The inner loop runs until `j <= i`, so the stars printed per row **shrink each time**.

This creates a **top-down decreasing pattern**.


## 📌 Pattern 5: Number Half Pyramid

---

### 📃 Description

This pattern prints a **half pyramid** made of numbers instead of stars.  
Each row prints numbers starting from `1` up to the current row number `i`.

This pattern helps beginners practice **nested loops** with numeric values and understand how the inner loop can be used to control **sequential number.

![NumberHalfPyramid](https://github.com/user-attachments/assets/2d078a58-8b89-4cb7-8e15-3ae21e34eaf1)
---

### 🔁 How It Works

- Outer loop runs from `i = 1` to `n`, controlling the number of rows.
- Inner loop runs from `j = 1` to `i`, printing numbers from `1` to the current row number.
- After printing each row’s numbers, `System.out.println()` moves to the next line.

  

## 📌 Pattern 6: Number Inverted Half Pyramid

---

### 📃 Description

This pattern prints an **inverted half pyramid using numbers**.  
Unlike the standard Number Half Pyramid where the numbers increase row by row, here the rows **decrease** in length — starting from the maximum and going down to `1`.

This inversion introduces the idea of **reversing the loop structure**, which is key in building more flexible logic patterns.

![NumberInvertedHalfPyramid](https://github.com/user-attachments/assets/b77c6f10-553b-44cb-863c-35cafbf74517)
---

### 🔁 What's Different?

Let’s compare it with **Pattern 5: Number Half Pyramid**:

| Feature                  | Half Pyramid         | Inverted Half Pyramid     |
|--------------------------|----------------------|----------------------------|
| Outer loop direction     | `i = 1` to `n`        | `i = n` to `1`             |
| Inner loop logic         | `j = 1` to `i`        | `j = 1` to `i`             |
| Output growth            | Numbers increase      | Numbers decrease           |
| Resulting shape          | Ascending triangle    | Descending triangle        |

By simply reversing the outer loop, the entire shape changes!


## 📌 Pattern 7: Floyd’s Triangle

---

### 📃 Description

Floyd’s Triangle is a famous number pattern where numbers are printed in a **continuous sequence**, row by row, forming a triangular structure.

Unlike the **Number Half Pyramid**, where each row prints numbers starting from `1`, this pattern continues numbering from where the last row left off — resulting in a triangle filled with **consecutive natural numbers**.
![Floyd’s Triangle](https://github.com/user-attachments/assets/2e68a571-13a3-4de1-9e07-cf54c6b0ade3)


### 🔁 How It Works

- A variable `number` is initialized to `0`.
- The outer loop runs from `1` to `n` to handle rows.
- The inner loop runs from `1` to `i`, printing the current value of `number`.
- After printing each number, `number` is incremented by `1`.

---

### 🔄 Difference from Number Half Pyramid

| Feature                     | Number Half Pyramid      | Floyd’s Triangle             |
|-----------------------------|---------------------------|-------------------------------|
| Starting number per row     | Always starts from `1`    | Continues from last number    |
| Pattern logic               | Resets `j` in every row   | Uses a single `number` counter |
| Output type                 | Repeats sequence each row | Builds on previous row         |
| Sequence                    | 1, 12, 123, ...           | 0, 01, 012, 0123, ...          |





