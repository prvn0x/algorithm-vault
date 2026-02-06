import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeIntervals {

    /**
     * Merges all overlapping intervals and returns non-overlapping intervals.
     *
     * @param intervals the input array of intervals [start, end]
     * @return array of merged non-overlapping intervals
     */
    public int[][] merge(int[][] intervals) {

        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0;
        int j = i + 1;

        int start = intervals[i][0];
        int end = intervals[i][1];

        while (i < intervals.length && j < intervals.length){

            if (end < intervals[j][0]){
                result.add(new int[]{start, end});
                start = intervals[j][0];
                end = Math.max(end, intervals[j][1]);
                i = j;
                j++;
            } else if (end >= intervals[j][0]) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    // Helper method to print 2D array
    private static void print2DArray(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();

        // Test Case 1
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("Test Case 1:");
        System.out.print("Input: ");
        print2DArray(intervals1);
        System.out.print("Output: ");
        print2DArray(solution.merge(intervals1));
        System.out.println("Expected: [[1, 6], [8, 10], [15, 18]]");
        System.out.println();

        // Test Case 2
        int[][] intervals2 = {{1, 4}, {4, 5}};
        System.out.println("Test Case 2:");
        System.out.print("Input: ");
        print2DArray(intervals2);
        System.out.print("Output: ");
        print2DArray(solution.merge(intervals2));
        System.out.println("Expected: [[1, 5]]");
        System.out.println();

        // Test Case 3
        int[][] intervals3 = {{4, 7}, {1, 4}};
        System.out.println("Test Case 3:");
        System.out.print("Input: ");
        print2DArray(intervals3);
        System.out.print("Output: ");
        print2DArray(solution.merge(intervals3));
        System.out.println("Expected: [[1, 7]]");
        System.out.println();

        // Test Case 4 - Single interval
        int[][] intervals4 = {{1, 4}};
        System.out.println("Test Case 4:");
        System.out.print("Input: ");
        print2DArray(intervals4);
        System.out.print("Output: ");
        print2DArray(solution.merge(intervals4));
        System.out.println("Expected: [[1, 4]]");
        System.out.println();

        // Test Case 5 - No overlapping intervals
        int[][] intervals5 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Test Case 5:");
        System.out.print("Input: ");
        print2DArray(intervals5);
        System.out.print("Output: ");
        print2DArray(solution.merge(intervals5));
        System.out.println("Expected: [[1, 2], [3, 4], [5, 6]]");
        System.out.println();

        // Test Case 6 - All overlapping
        int[][] intervals6 = {{1, 4}, {2, 5}, {3, 6}};
        System.out.println("Test Case 6:");
        System.out.print("Input: ");
        print2DArray(intervals6);
        System.out.print("Output: ");
        print2DArray(solution.merge(intervals6));
        System.out.println("Expected: [[1, 6]]");
    }
}
