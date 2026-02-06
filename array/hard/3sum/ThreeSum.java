import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSum {

    /**
     * Finds all unique triplets in the array that sum to zero.
     *
     * @param nums the input array of integers
     * @return list of triplets that sum to zero
     */
    public List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k){

                int  sum = nums[i] + nums[j] + nums[k];

                if (sum > 0){
                    k--;
                }
                else if (sum < 0){
                    j++;
                }
                else {
                    List<Integer> firstAnswer = new ArrayList<>();
                    firstAnswer.add(nums[i]);
                    firstAnswer.add(nums[j]);
                    firstAnswer.add(nums[k]);
                    result.add(firstAnswer);

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        // Test Case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        System.out.println("Output: " + solution.threeSum(nums1));
        System.out.println("Expected: [[-1, -1, 2], [-1, 0, 1]]");
        System.out.println();

        // Test Case 2
        int[] nums2 = {0, 1, 1};
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        System.out.println("Output: " + solution.threeSum(nums2));
        System.out.println("Expected: []");
        System.out.println();

        // Test Case 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3));
        System.out.println("Output: " + solution.threeSum(nums3));
        System.out.println("Expected: [[0, 0, 0]]");
        System.out.println();

        // Test Case 4 - Multiple triplets
        int[] nums4 = {-2, 0, 1, 1, 2};
        System.out.println("Test Case 4:");
        System.out.println("Input: nums = " + Arrays.toString(nums4));
        System.out.println("Output: " + solution.threeSum(nums4));
        System.out.println("Expected: [[-2, 0, 2], [-2, 1, 1]]");
        System.out.println();

        // Test Case 5 - No valid triplets
        int[] nums5 = {1, 2, 3};
        System.out.println("Test Case 5:");
        System.out.println("Input: nums = " + Arrays.toString(nums5));
        System.out.println("Output: " + solution.threeSum(nums5));
        System.out.println("Expected: []");
        System.out.println();

        // Test Case 6 - Large array with duplicates
        int[] nums6 = {-4, -1, -1, 0, 1, 2};
        System.out.println("Test Case 6:");
        System.out.println("Input: nums = " + Arrays.toString(nums6));
        System.out.println("Output: " + solution.threeSum(nums6));
        System.out.println("Expected: [[-1, -1, 2], [-1, 0, 1]]");
    }
}
