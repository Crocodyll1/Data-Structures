import java.util.HashMap;

public class SubArraySumOS {


        public static int subarraySum(int[] nums, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            int sum = 0;
            int count = 0;

            for (int num : nums) {
                sum += num;

                count += map.getOrDefault(sum - k, 0);

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }

        public static void main(String[] args) {

            int[] nums = {1, 1, 1};
            int k = 2;

            System.out.println(subarraySum(nums, k));
        }
    }


/*
Approach:

1. Use Prefix Sum and HashMap.

2. Store prefixSum -> frequency in the HashMap.
   Initialize map with {0,1} to handle subarrays
   that start from index 0.

3. Traverse the array:
   - Add current element to prefixSum.
   - Check if (prefixSum - k) exists in the map.
     If it exists, add its frequency to count
     because it forms a subarray with sum k.
   - Store/update the current prefixSum frequency
     in the map.

4. Return the total count of subarrays whose sum equals k.

Time Complexity: O(N)
Space Complexity: O(N)
*/
