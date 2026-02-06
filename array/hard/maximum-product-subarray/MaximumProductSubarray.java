import java.util.Arrays;

public class MaximumProductSubarray {

    /**
     * Finds the contiguous subarray with the largest product.
     *
     * @param nums the input array of integers
     * @return the maximum product
     */
    public int maxProduct(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                prefix = prefix * nums[i];
                suffix = suffix * nums[nums.length - i - 1];
            }
            maximum = Math.max(maximum, Math.max(prefix, suffix));
            if (nums[i] == 0){
                maximum = Math.max(maximum, 0);
                prefix = 1;
                suffix = 1;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        MaximumProductSubarray solution = new MaximumProductSubarray();

        // Test Case 1
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + solution.maxProduct(nums1));
        System.out.println("Expected: 6");
        System.out.println("Explanation: [2,3] has the largest product 6");
        System.out.println();

        // Test Case 2
        int[] nums2 = {-2, 0, -1};
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + solution.maxProduct(nums2));
        System.out.println("Expected: 0");
        System.out.println("Explanation: Zero is in the array, max product is 0");
        System.out.println();

        // Test Case 3 - Single element
        int[] nums3 = {-2};
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3));
        System.out.println("Output: " + solution.maxProduct(nums3));
        System.out.println("Expected: -2");
        System.out.println();

        // Test Case 4 - All positive
        int[] nums4 = {2, 3, 4};
        System.out.println("Test Case 4:");
        System.out.println("Input: nums = " + Arrays.toString(nums4));
        System.out.println("Output: " + solution.maxProduct(nums4));
        System.out.println("Expected: 24");
        System.out.println("Explanation: [2,3,4] has product 24");
        System.out.println();

        // Test Case 5 - Two negatives make positive
        int[] nums5 = {-2, 3, -4};
        System.out.println("Test Case 5:");
        System.out.println("Input: nums = " + Arrays.toString(nums5));
        System.out.println("Output: " + solution.maxProduct(nums5));
        System.out.println("Expected: 24");
        System.out.println("Explanation: [-2,3,-4] has product 24");
        System.out.println();

        // Test Case 6 - Multiple zeros
        int[] nums6 = {0, 2, 0, 4};
        System.out.println("Test Case 6:");
        System.out.println("Input: nums = " + Arrays.toString(nums6));
        System.out.println("Output: " + solution.maxProduct(nums6));
        System.out.println("Expected: 4");
        System.out.println("Explanation: Zeros reset the product, max single element is 4");
        System.out.println();

        // Test Case 7 - All negative (odd count)
        int[] nums7 = {-2, -3, -4};
        System.out.println("Test Case 7:");
        System.out.println("Input: nums = " + Arrays.toString(nums7));
        System.out.println("Output: " + solution.maxProduct(nums7));
        System.out.println("Expected: 12");
        System.out.println("Explanation: [-3,-4] has product 12 (skip first -2)");
    }
}
