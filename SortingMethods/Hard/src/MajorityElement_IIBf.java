import java.util.*;

public class MajorityElement_IIBf {


        public List<Integer> majorityElement(int[] nums) {
            int n = nums.length;
            List<Integer> result = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            int mini = (n / 3) + 1;

            for (int i = 0; i < n; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

                if (map.get(nums[i]) == mini) {
                    result.add(nums[i]);
                }

                if (result.size() == 2) {
                    break;
                }
            }

            return result;
        }

    public static void main(String[] args) {


        MajorityElement_IIBf obj = new MajorityElement_IIBf();
        int[] nums = {3, 2, 3};

        List<Integer> ans = obj.majorityElement(nums);

        System.out.println(ans);




    }
}

/*
Approach:
1. Create a HashMap to store the frequency of each element.
2. Calculate the minimum frequency required:
      mini = (n / 3) + 1
3. Traverse the array:
      - Update the frequency of the current element.
      - If its frequency becomes equal to mini,
        add it to the result list.
4. Since at most 2 elements can appear more than n/3 times,
   stop if the result size becomes 2.
5. Return the result list.

TC: O(n)
SC: O(n)
*/