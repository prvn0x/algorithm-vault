# Majority Element II

## Problem Description

Given an integer array of size `n`, find all elements that appear more than `⌊n/3⌋` times.

## Examples

### Example 1:
```
Input: nums = [3,2,3]
Output: [3]
```

**Explanation:** Element 3 appears 2 times, which is more than ⌊3/3⌋ = 1 time.

### Example 2:
```
Input: nums = [1]
Output: [1]
```

**Explanation:** Element 1 appears 1 time, which is more than ⌊1/3⌋ = 0 times.

### Example 3:
```
Input: nums = [1,2]
Output: [1,2]
```

**Explanation:** Both elements appear 1 time, which is more than ⌊2/3⌋ = 0 times.

## Constraints

- `1 <= nums.length <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`

## Key Insights

- There can be **at most 2 elements** that appear more than ⌊n/3⌋ times
- This is because if there were 3 such elements, they would occupy more than n positions (3 * (n/3 + 1) > n)
- The optimal solution uses **Boyer-Moore Voting Algorithm** with O(n) time and O(1) space

## Topics
- Array
- Hash Table
- Sorting
- Counting

## Difficulty
Medium (categorized as Hard in this repo)

## LeetCode
[Problem #229 - Majority Element II](https://leetcode.com/problems/majority-element-ii/)

## Follow-up
Can you solve the problem in linear time and O(1) space?
