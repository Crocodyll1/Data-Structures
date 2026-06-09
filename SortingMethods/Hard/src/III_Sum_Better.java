import java.util.*;

public class III_Sum_Better {

    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        // Stores unique triplets
        Set<List<Integer>> result = new HashSet<>();

        // Fix the first element of the triplet
        for (int i = 0; i < n; i++) {

            // HashSet to store elements seen so far
            // for the current i
            HashSet<Integer> seen = new HashSet<>();

            // Find the other two elements
            for (int j = i + 1; j < n; j++) {

                // Required third element so that
                // nums[i] + nums[j] + third = 0
                int third = -(nums[i] + nums[j]);

                // If third already exists in seen,
                // we found a valid triplet
                if (seen.contains(third)) {

                    List<Integer> triplet =
                            Arrays.asList(nums[i], nums[j], third);

                    // Sort triplet to avoid duplicates
                    // Example:
                    // [-1,0,1] and [0,-1,1]
                    Collections.sort(triplet);

                    // HashSet automatically removes duplicates
                    result.add(triplet);
                }

                // Store current element for future checks
                seen.add(nums[j]);
            }
        }

        // Convert Set to List and return
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(nums);

        System.out.println(ans);
    }
}

/*
Time: O(n²)
Space: O(n)
 */