# 3Sum

## Problem Description

Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

## Examples

### Example 1:
```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

**Explanation:**
- `nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0`
- `nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0`
- `nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0`
- The distinct triplets are `[-1,0,1]` and `[-1,-1,2]`
- Notice that the order of the output and the order of the triplets does not matter

### Example 2:
```
Input: nums = [0,1,1]
Output: []
```

**Explanation:** The only possible triplet does not sum up to 0.

### Example 3:
```
Input: nums = [0,0,0]
Output: [[0,0,0]]
```

**Explanation:** The only possible triplet sums up to 0.

## Constraints

- `3 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`

## Key Insights

- **Avoid Duplicates:** The solution must not contain duplicate triplets
- **Two-Pointer Approach:** After sorting, fix one element and use two pointers to find the other two
- **Optimization:** Skip duplicate elements to avoid duplicate triplets
- **Time Complexity:** O(n²) with sorting and two-pointer technique
- **Space Complexity:** O(1) excluding the output array

## Approach Hints

1. **Sort the array** first to enable two-pointer technique and easier duplicate handling
2. **Fix one element** and find the other two using two pointers
3. **Skip duplicates** by checking if the current element equals the previous one
4. **Two pointers:** Move left pointer right if sum is too small, move right pointer left if sum is too large

## Topics
- Array
- Two Pointers
- Sorting

## Difficulty
Medium (categorized as Hard in this repo)

## LeetCode
[Problem #15 - 3Sum](https://leetcode.com/problems/3sum/)

## Related Problems
- Two Sum (Easy)
- 4Sum (Medium)
- 3Sum Closest (Medium)
