import java.util.*;

public class MajorityElementIIBetter {

    /*
    Approach:
    1. Use a HashMap to store the frequency of each element.
    2. Calculate the minimum frequency required:
          mini = (n / 3) + 1
    3. Traverse the array and update frequencies.
    4. When an element's frequency becomes mini,
       add it to the result list.
    5. Since at most 2 elements can appear more than n/3 times,
       stop if result size becomes 2.
    6. Return the result.

    TC: O(n)
    SC: O(n)
    */

    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int mini = (n / 3) + 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) == mini) {
                result.add(num);
            }

            if (result.size() == 2) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        MajorityElementIIBetter obj = new MajorityElementIIBetter();

        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};

        System.out.println(obj.majorityElement(nums));
    }
}

//HashMap (Better)
//TC - O(n)
//SC - O(n)