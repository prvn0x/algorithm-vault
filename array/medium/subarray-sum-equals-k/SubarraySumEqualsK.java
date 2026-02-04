import java.util.Arrays;
import java.util.HashMap;

public class SubarraySumEqualsK {

    /**
     * Returns the total number of subarrays whose sum equals to k.
     *
     * @param nums the input array of integers
     * @param k the target sum
     * @return the total number of subarrays with sum equals to k
     */
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int prefixSum = 0;

        // defining a hashmap to store previous sum and their count
        HashMap<Integer, Integer> map = new HashMap<>();

        // by default adding 0 as key value as 1
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++){
            prefixSum += nums[i];

            if (map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();

        // Test Case 1
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output: " + solution.subarraySum(nums1, k1));
        System.out.println("Expected: 2");
        System.out.println();

        // Test Case 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output: " + solution.subarraySum(nums2, k2));
        System.out.println("Expected: 2");
        System.out.println();

        // Test Case 3 - Single element equals k
        int[] nums3 = {1};
        int k3 = 1;
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Output: " + solution.subarraySum(nums3, k3));
        System.out.println("Expected: 1");
        System.out.println();

        // Test Case 4 - Negative numbers
        int[] nums4 = {1, -1, 0};
        int k4 = 0;
        System.out.println("Test Case 4:");
        System.out.println("Input: nums = " + Arrays.toString(nums4) + ", k = " + k4);
        System.out.println("Output: " + solution.subarraySum(nums4, k4));
        System.out.println("Expected: 3");
        System.out.println();

        // Test Case 5 - No subarray equals k
        int[] nums5 = {1, 2, 3};
        int k5 = 10;
        System.out.println("Test Case 5:");
        System.out.println("Input: nums = " + Arrays.toString(nums5) + ", k = " + k5);
        System.out.println("Output: " + solution.subarraySum(nums5, k5));
        System.out.println("Expected: 0");
        System.out.println();

        // Test Case 6 - Complex array with positive and negative numbers
        int[] nums6 = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k6 = 3;
        System.out.println("Test Case 6:");
        System.out.println("Input: nums = " + Arrays.toString(nums6) + ", k = " + k6);
        System.out.println("Output: " + solution.subarraySum(nums6, k6));
        System.out.println("Expected: 8");
    }
}
