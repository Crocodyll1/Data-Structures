
import java.util.*;

    public class IV_SUM_OS {

        /*
         * Optimal Approach (Sorting + Two Pointers)
         *
         * 1. Sort the array.
         *
         * 2. Fix the first element using index i.
         *    Skip duplicate values of i to avoid duplicate quadruplets.
         *
         * 3. Fix the second element using index j.
         *    Skip duplicate values of j.
         *
         * 4. Use two pointers:
         *      k = j + 1  (left pointer)
         *      l = n - 1  (right pointer)
         *
         * 5. Calculate:
         *      sum = nums[i] + nums[j] + nums[k] + nums[l]
         *
         *    - If sum < target:
         *          Move k forward.
         *
         *    - If sum > target:
         *          Move l backward.
         *
         *    - If sum == target:
         *          Store the quadruplet.
         *          Move both pointers.
         *          Skip duplicate values of k and l.
         *
         * 6. Continue until all unique quadruplets are found.
         *
         * Time Complexity:
         *      O(n³)
         *
         * Space Complexity:
         *      O(1) excluding output list.
         */

        public static List<List<Integer>> fourSum(int[] nums, int target) {

            int n = nums.length;
            List<List<Integer>> result = new ArrayList<>();

            Arrays.sort(nums);

            for (int i = 0; i < n - 3; i++) {

                // Skip duplicate first elements
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                for (int j = i + 1; j < n - 2; j++) {

                    // Skip duplicate second elements
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }

                    int k = j + 1;
                    int l = n - 1;

                    while (k < l) {

                        long sum = (long) nums[i]
                                + nums[j]
                                + nums[k]
                                + nums[l];

                        if (sum < target) {
                            k++;
                        }
                        else if (sum > target) {
                            l--;
                        }
                        else {

                            List<Integer> quad = new ArrayList<>();

                            quad.add(nums[i]);
                            quad.add(nums[j]);
                            quad.add(nums[k]);
                            quad.add(nums[l]);

                            result.add(quad);

                            k++;
                            l--;

                            // Skip duplicate third elements
                            while (k < l && nums[k] == nums[k - 1]) {
                                k++;
                            }

                            // Skip duplicate fourth elements
                            while (k < l && nums[l] == nums[l + 1]) {
                                l--;
                            }
                        }
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {

            int[] nums = {1, 0, -1, 0, -2, 2};
            int target = 0;

            List<List<Integer>> result = fourSum(nums, target);

            System.out.println(result);
        }
    }
