# Subarray Sum Equals K

## Problem Description

Given an array of integers `nums` and an integer `k`, return the total number of subarrays whose sum equals to `k`.

A subarray is a contiguous non-empty sequence of elements within an array.

## Examples

### Example 1:
```
Input: nums = [1,1,1], k = 2
Output: 2
```

**Explanation:** The subarrays with sum equals to 2 are:
- [1,1] (indices 0-1)
- [1,1] (indices 1-2)

### Example 2:
```
Input: nums = [1,2,3], k = 3
Output: 2
```

**Explanation:** The subarrays with sum equals to 3 are:
- [1,2] (indices 0-1)
- [3] (index 2)

## Constraints

- `1 <= nums.length <= 2 * 10^4`
- `-1000 <= nums[i] <= 1000`
- `-10^7 <= k <= 10^7`

## Topics
- Array
- Hash Table
- Prefix Sum

## Difficulty
Medium

## LeetCode
[Problem #560 - Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)
