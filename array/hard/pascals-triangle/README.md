# Pascal's Triangle Problems

This folder contains three variations of Pascal's Triangle problems.

## Problem Variations

### 1. Find Element at Position (FindElementAtPosition.java)
Given row number `r` and column number `c`, find the element at that position in Pascal's Triangle.

**Example:**
```
Input: r = 5, c = 3
Output: 6
Explanation: Pascal's Triangle row 5 is [1, 4, 6, 4, 1], element at position 3 is 6
```

**Note:** Both row and column indices can be 0-indexed or 1-indexed depending on the problem variant.

---

### 2. Print Specific Row (PrintRow.java)
Given a row number `n`, return the nth row of Pascal's Triangle.

**Example:**
```
Input: rowIndex = 3
Output: [1, 3, 3, 1]
```

**Pascal's Triangle visualization:**
```
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
```

---

### 3. Print Complete Triangle (PrintTriangle.java)
Given a number of rows `numRows`, generate the first `numRows` of Pascal's Triangle.

**Example:**
```
Input: numRows = 5
Output: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
```

## Pascal's Triangle Properties

- Each number is the sum of the two numbers directly above it
- The first and last element of each row is always 1
- Row `n` has `n+1` elements (0-indexed)
- Element at position (r, c) can be calculated using combination formula: C(r, c) = r! / (c! * (r-c)!)

## Topics
- Array
- Dynamic Programming
- Math
- Combinatorics

## Difficulty
Hard

## LeetCode References
- [Problem #118 - Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)
- [Problem #119 - Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/)
