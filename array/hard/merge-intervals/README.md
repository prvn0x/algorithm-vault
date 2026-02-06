# Merge Intervals

## Problem Description

Given an array of `intervals` where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

## Examples

### Example 1:
```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
```

**Explanation:** Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

**Visualization:**
```
[1,3]:      [===]
[2,6]:        [=====]
Merged:     [=======]

[8,10]:              [==]
[15,18]:                    [===]
```

### Example 2:
```
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
```

**Explanation:** Intervals [1,4] and [4,5] are considered overlapping (touching at boundary).

### Example 3:
```
Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
```

**Explanation:** After sorting, [1,4] and [4,7] overlap and merge into [1,7].

## Constraints

- `1 <= intervals.length <= 10^4`
- `intervals[i].length == 2`
- `0 <= starti <= endi <= 10^4`

## Key Insights

- **Sort First:** Sort intervals by start time to process them in order
- **Overlapping Condition:** Two intervals `[a, b]` and `[c, d]` overlap if `c <= b` (after sorting by start)
- **Merge Strategy:** Update the end of the last interval to `max(current_end, last_end)`
- **Time Complexity:** O(n log n) due to sorting
- **Space Complexity:** O(n) for the output array (or O(log n) for sorting if we don't count output)

## Approach Hints

1. **Sort intervals** by their start time
2. **Initialize result** with the first interval
3. **Iterate through remaining intervals:**
   - If current interval overlaps with the last interval in result:
     - Merge them by updating the end to `max(current.end, last.end)`
   - Otherwise:
     - Add current interval to result (no overlap)
4. **Return** the merged intervals

## Edge Cases to Consider

- Single interval (return as is)
- All intervals overlap (return single merged interval)
- No overlapping intervals (return sorted input)
- Intervals touching at boundaries (considered overlapping)
- Unsorted input (must sort first)

## Topics
- Array
- Sorting
- Intervals

## Difficulty
Medium (categorized as Hard in this repo)

## LeetCode
[Problem #56 - Merge Intervals](https://leetcode.com/problems/merge-intervals/)

## Related Problems
- Insert Interval (Medium)
- Meeting Rooms (Easy)
- Meeting Rooms II (Medium)
- Non-overlapping Intervals (Medium)
