# 4Sum

## Problem Description

Given an array `nums` of `n` integers, return an array of all the unique quadruplets `[nums[a], nums[b], nums[c], nums[d]]` such that:

- `0 <= a, b, c, d < n`
- `a`, `b`, `c`, and `d` are **distinct**
- `nums[a] + nums[b] + nums[c] + nums[d] == target`

You may return the answer in any order.

## Examples

### Example 1:
```
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```

### Example 2:
```
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
```

## Constraints

- `1 <= nums.length <= 200`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`

## Key Insights

- **Generalization of 3Sum:** Uses the same two-pointer approach but with an additional outer loop
- **Avoid Duplicates:** Must skip duplicate quadruplets
- **Two Nested Loops + Two Pointers:** Fix two elements with loops, find remaining two with two-pointer technique
- **Time Complexity:** O(n³) with sorting and nested loops
- **Space Complexity:** O(1) excluding the output array

## Approach Hints

1. **Sort the array** first to enable two-pointer technique and duplicate handling
2. **Fix first element (i)** in the outer loop
3. **Fix second element (j)** in the second loop (j = i + 1)
4. **Use two pointers (left, right)** to find the remaining two elements
5. **Skip duplicates** at all levels: i, j, left, and right
6. **Calculate remaining target:** `target - nums[i] - nums[j]` for the two-pointer search

## Edge Cases to Consider

- All elements are the same
- Array length less than 4 (return empty)
- No valid quadruplets exist
- Multiple quadruplets with same elements
- Integer overflow when summing (use long for intermediate calculations)

## Topics
- Array
- Two Pointers
- Sorting

## Difficulty
Medium (categorized as Hard in this repo)

## LeetCode
[Problem #18 - 4Sum](https://leetcode.com/problems/4sum/)

## Related Problems
- Two Sum (Easy)
- 3Sum (Medium)
- 4Sum II (Medium)
