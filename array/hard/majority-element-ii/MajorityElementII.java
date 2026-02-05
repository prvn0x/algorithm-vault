import java.util.*;

public class MajorityElementII {

    /**
     * Finds all elements that appear more than ⌊n/3⌋ times in the array.
     *
     * @param nums the input array of integers
     * @return list of elements appearing more than ⌊n/3⌋ times
     */
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> output = new ArrayList<>();
        int minCount = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > minCount && !output.contains(nums[i])){
                output.add(nums[i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        MajorityElementII solution = new MajorityElementII();

        // Test Case 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + solution.majorityElement(nums1));
        System.out.println("Expected: [3]");
        System.out.println();

        // Test Case 2
        int[] nums2 = {1};
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + solution.majorityElement(nums2));
        System.out.println("Expected: [1]");
        System.out.println();

        // Test Case 3
        int[] nums3 = {1, 2};
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3));
        System.out.println("Output: " + solution.majorityElement(nums3));
        System.out.println("Expected: [1, 2]");
        System.out.println();

        // Test Case 4 - Multiple majority elements
        int[] nums4 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println("Test Case 4:");
        System.out.println("Input: nums = " + Arrays.toString(nums4));
        System.out.println("Output: " + solution.majorityElement(nums4));
        System.out.println("Expected: [1, 2]");
        System.out.println();

        // Test Case 5 - No majority element beyond threshold
        int[] nums5 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 5:");
        System.out.println("Input: nums = " + Arrays.toString(nums5));
        System.out.println("Output: " + solution.majorityElement(nums5));
        System.out.println("Expected: []");
        System.out.println();

        // Test Case 6 - All same elements
        int[] nums6 = {2, 2, 2, 2, 2};
        System.out.println("Test Case 6:");
        System.out.println("Input: nums = " + Arrays.toString(nums6));
        System.out.println("Output: " + solution.majorityElement(nums6));
        System.out.println("Expected: [2]");
    }
}
