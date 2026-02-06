import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FourSum {

    /**
     * Finds all unique quadruplets in the array that sum to target.
     *
     * @param nums the input array of integers
     * @param target the target sum
     * @return list of quadruplets that sum to target
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j = i+1; j < nums.length; j++){
                if (j > i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = nums.length-1;

                while (k < l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k+1]) k++;
                        while (k < l && nums[l] == nums[l-1]) l--;
                    }
                    else if (sum < target){
                        k++;
                    }
                    else {
                        l--;
                    }
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        FourSum solution = new FourSum();

        // Test Case 1
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + solution.fourSum(nums1, target1));
        System.out.println("Expected: [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]");
        System.out.println();

        // Test Case 2
        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + solution.fourSum(nums2, target2));
        System.out.println("Expected: [[2, 2, 2, 2]]");
        System.out.println();

        // Test Case 3 - Empty result
        int[] nums3 = {1, 2, 3, 4};
        int target3 = 0;
        System.out.println("Test Case 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("Output: " + solution.fourSum(nums3, target3));
        System.out.println("Expected: []");
        System.out.println();

        // Test Case 4 - Array length less than 4
        int[] nums4 = {1, 2, 3};
        int target4 = 6;
        System.out.println("Test Case 4:");
        System.out.println("Input: nums = " + Arrays.toString(nums4) + ", target = " + target4);
        System.out.println("Output: " + solution.fourSum(nums4, target4));
        System.out.println("Expected: []");
        System.out.println();

        // Test Case 5 - Single valid quadruplet
        int[] nums5 = {-3, -1, 0, 2, 4, 5};
        int target5 = 2;
        System.out.println("Test Case 5:");
        System.out.println("Input: nums = " + Arrays.toString(nums5) + ", target = " + target5);
        System.out.println("Output: " + solution.fourSum(nums5, target5));
        System.out.println("Expected: [[-3, -1, 2, 4]]");
        System.out.println();

        // Test Case 6 - All zeros
        int[] nums6 = {0, 0, 0, 0};
        int target6 = 0;
        System.out.println("Test Case 6:");
        System.out.println("Input: nums = " + Arrays.toString(nums6) + ", target = " + target6);
        System.out.println("Output: " + solution.fourSum(nums6, target6));
        System.out.println("Expected: [[0, 0, 0, 0]]");
    }
}
