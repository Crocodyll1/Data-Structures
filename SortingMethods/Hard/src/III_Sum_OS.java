import java.util.*;

public class III_Sum_OS {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element
        for (int i = 0; i < n; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            // Step 3: Two Pointer Search
            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                }
                else if (sum > 0) {
                    k--;
                }
                else {

                    // Triplet found
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // Skip duplicate left values
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate right values
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}

/*
 * Approach:
 * 1. Sort the array.
 * 2. Fix one element nums[i].
 * 3. Use two pointers:
 *      j = i + 1 (left pointer)
 *      k = n - 1 (right pointer)
 * 4. Calculate sum = nums[i] + nums[j] + nums[k].
 *      - If sum < 0, move j forward.
 *      - If sum > 0, move k backward.
 *      - If sum == 0, store the triplet.
 * 5. Skip duplicate values of i, j, and k to avoid duplicate triplets.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1) excluding output list
 */