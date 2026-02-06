# Count Subarrays with Given XOR K

## Problem Description

Given an array of integers `nums` and an integer `k`, return the total number of subarrays whose XOR equals to `k`.

A subarray is a contiguous non-empty sequence of elements within an array.

## Examples

### Example 1:
```
Input: nums = [4, 2, 2, 6, 4], k = 6
Output: 4
```

**Explanation:** The subarrays having XOR of their elements as 6 are:
- `[4, 2]` → 4 ^ 2 = 6
- `[4, 2, 2, 6, 4]` → 4 ^ 2 ^ 2 ^ 6 ^ 4 = 6
- `[2, 2, 6]` → 2 ^ 2 ^ 6 = 6
- `[6]` → 6

### Example 2:
```
Input: nums = [5, 6, 7, 8, 9], k = 5
Output: 2
```

**Explanation:** The subarrays having XOR of their elements as 5 are:
- `[5]` → 5
- `[5, 6, 7, 8, 9]` → 5 ^ 6 ^ 7 ^ 8 ^ 9 = 5

### Example 3:
```
Input: nums = [5, 2, 9], k = 7
Output: 1
```

**Explanation:** The subarray having XOR of elements as 7 is:
- `[5, 2]` → 5 ^ 2 = 7

## Constraints

- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^9`
- `1 <= k <= 10^9`

## Key Insights

- **Similar to Subarray Sum Equals K:** Uses the same HashMap approach but with XOR instead of sum
- **Prefix XOR:** Track cumulative XOR values from the start
- **XOR Property:** If `prefixXOR[i] ^ prefixXOR[j] = k`, then subarray from `j+1` to `i` has XOR = k
- **Rearranging:** `prefixXOR[j] = prefixXOR[i] ^ k` (since XOR is self-inverse)
- **Time Complexity:** O(n) with HashMap
- **Space Complexity:** O(n) for the HashMap

## XOR Properties to Remember

1. `a ^ a = 0` (self-canceling)
2. `a ^ 0 = a` (identity)
3. `a ^ b = c` implies `a = b ^ c` (self-inverse)
4. XOR is commutative: `a ^ b = b ^ a`
5. XOR is associative: `(a ^ b) ^ c = a ^ (b ^ c)`

## Approach Hints

1. Use a HashMap to store prefix XOR values and their frequencies
2. For each element, calculate the current prefix XOR
3. Check if `(prefixXOR ^ k)` exists in the HashMap
4. If yes, add its frequency to the result (those are valid subarrays ending at current index)
5. Update the HashMap with the current prefix XOR

## Topics
- Array
- Hash Table
- Bit Manipulation
- Prefix XOR

## Difficulty
Hard

## Related Problems
- Subarray Sum Equals K (Medium)
- Maximum XOR of Two Numbers in an Array (Medium)
