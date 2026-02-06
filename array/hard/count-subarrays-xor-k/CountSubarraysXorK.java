import java.util.HashMap;
import java.util.Arrays;

public class CountSubarraysXorK {

    /**
     * Returns the total number of subarrays whose XOR equals to k.
     *
     * @param nums the input array of integers
     * @param k the target XOR value
     * @return the total number of subarrays with XOR equals to k
     */
    public int subarrayXor(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixXor = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            prefixXor ^= nums[i];

            int requiredXor = prefixXor ^ k;
            if (map.containsKey(requiredXor)){
                result += map.get(requiredXor);
            }
            map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        CountSubarraysXorK solution = new CountSubarraysXorK();

        // Test Case 1
        int[] nums1 = {4, 2, 2, 6, 4};
        int k1 = 6;
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Output: " + solution.subarrayXor(nums1, k1));
        System.out.println("Expected: 4");
        System.out.println();

        // Test Case 2
        int[] nums2 = {5, 6, 7, 8, 9};
        int k2 = 5;
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Output: " + solution.subarrayXor(nums2, k2));
        System.out.println("Expected: 2");
        System.out.println();

        // Test Case 3
        int[] nums3 = {5, 2, 9};
        int k3 = 7;
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", k = " + k3);
        System.out.println("Output: " + solution.subarrayXor(nums3, k3));
        System.out.println("Expected: 1");
        System.out.println();

        // Test Case 4 - Single element equals k
        int[] nums4 = {7};
        int k4 = 7;
        System.out.println("Test Case 4:");
        System.out.println("Input: nums = " + Arrays.toString(nums4) + ", k = " + k4);
        System.out.println("Output: " + solution.subarrayXor(nums4, k4));
        System.out.println("Expected: 1");
        System.out.println();

        // Test Case 5 - All elements XOR to k
        int[] nums5 = {1, 2, 3};
        int k5 = 0;
        System.out.println("Test Case 5:");
        System.out.println("Input: nums = " + Arrays.toString(nums5) + ", k = " + k5);
        System.out.println("Output: " + solution.subarrayXor(nums5, k5));
        System.out.println("Expected: 1");
        System.out.println("Explanation: Only [1,2,3] XORs to 0 (1^2^3 = 0)");
        System.out.println();

        // Test Case 6 - No subarray with XOR k
        int[] nums6 = {1, 2, 3};
        int k6 = 10;
        System.out.println("Test Case 6:");
        System.out.println("Input: nums = " + Arrays.toString(nums6) + ", k = " + k6);
        System.out.println("Output: " + solution.subarrayXor(nums6, k6));
        System.out.println("Expected: 0");
    }
}
