# Maximum Product Subarray

## Problem Description

Given an integer array `nums`, find a **contiguous subarray** that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

**Note:** The product of an array with a single element is the value of that element.

## Examples

### Example 1:
```
Input: nums = [2,3,-2,4]
Output: 6
```

**Explanation:** Subarray [2,3] has the largest product 6.

**All products:**
- [2] → 2
- [2,3] → 6 ✓ (maximum)
- [2,3,-2] → -12
- [2,3,-2,4] → -48
- [3] → 3
- [3,-2] → -6
- [3,-2,4] → -24
- [-2] → -2
- [-2,4] → -8
- [4] → 4

### Example 2:
```
Input: nums = [-2,0,-1]
Output: 0
```

**Explanation:** The result cannot be 2, because [-2,-1] is not a contiguous subarray (0 is in between).

## Constraints

- `1 <= nums.length <= 2 * 10^4`
- `-10 <= nums[i] <= 10`
- The product of any subarray of nums is guaranteed to fit in a 32-bit integer

## Key Insights

- **Track Both Max AND Min:** Need to track both maximum and minimum products because:
  - A negative number can turn a small (negative) product into a large (positive) product
  - Example: min = -10, current = -2 → new max = 20

- **Three Choices at Each Position:**
  1. Start a new subarray from current element
  2. Extend previous max product (if current is positive)
  3. Extend previous min product (if current is negative)

- **Why Track Minimum?**
  - Negative × Negative = Positive
  - If current number is negative, multiplying by the minimum (most negative) gives maximum
  - Example: [-2, 3, -4] → min at index 1 is -6, then -6 × -4 = 24

- **Time Complexity:** O(n) - single pass
- **Space Complexity:** O(1) - only track current max and min

## Approach Hints

1. **Initialize:**
   - `maxProduct = nums[0]` (result to return)
   - `currentMax = nums[0]` (max product ending at current position)
   - `currentMin = nums[0]` (min product ending at current position)

2. **For each element (starting from index 1):**
   ```
   If current element is negative, swap currentMax and currentMin
   (because negative flips the products)

   currentMax = max(current element, currentMax × current element)
   currentMin = min(current element, currentMin × current element)

   maxProduct = max(maxProduct, currentMax)
   ```

3. **Why Swap?**
   - When multiplying by negative, max becomes min and min becomes max
   - Swapping before calculation simplifies logic

## Edge Cases to Consider

- Array with single element
- Array with zeros (resets the product)
- All negative numbers
- Mix of positive, negative, and zeros
- Large products (but guaranteed to fit in 32-bit int)

## Topics
- Array
- Dynamic Programming

## Difficulty
Medium (categorized as Hard in this repo)

## LeetCode
[Problem #152 - Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)

## Related Problems
- Maximum Subarray (Kadane's Algorithm) (Medium)
- Product of Array Except Self (Medium)
- Subarray Product Less Than K (Medium)
