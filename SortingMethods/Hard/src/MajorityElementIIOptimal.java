
    import java.util.*;

    public class MajorityElementIIOptimal {

    /*
    Approach:
    1. An element must appear more than n/3 times.
    2. There can be at most 2 such elements.
    3. Maintain two candidates and their counts.
    4. First pass finds potential candidates.
    5. Second pass verifies their frequencies.
    6. Add candidates whose frequency is greater than n/3.

    TC: O(n)
    SC: O(1)
    */

        public List<Integer> majorityElement(int[] nums) {

            int candidate1 = 0, candidate2 = 0;
            int count1 = 0, count2 = 0;

            // First Pass: Find potential candidates
            for (int num : nums) {

                if (num == candidate1) {
                    count1++;
                }
                else if (num == candidate2) {
                    count2++;
                }
                else if (count1 == 0) {
                    candidate1 = num;
                    count1 = 1;
                }
                else if (count2 == 0) {
                    candidate2 = num;
                    count2 = 1;
                }
                else {
                    count1--;
                    count2--;
                }
            }

            // Second Pass: Verify candidates
            count1 = 0;
            count2 = 0;

            for (int num : nums) {
                if (num == candidate1) {
                    count1++;
                }
                else if (num == candidate2) {
                    count2++;
                }
            }

            List<Integer> result = new ArrayList<>();

            int mini = nums.length / 3;

            if (count1 > mini) {
                result.add(candidate1);
            }

            if (count2 > mini) {
                result.add(candidate2);
            }

            return result;
        }

        public static void main(String[] args) {

            MajorityElementIIOptimal obj = new MajorityElementIIOptimal();

            int[] nums = {3, 2, 3};

            List<Integer> ans = obj.majorityElement(nums);

            System.out.println(ans);
        }
    }


    /*
Approach:
1. An element must appear more than n/3 times.
2. There can be at most 2 such elements.
3. Maintain two candidates (candidate1, candidate2)
   and their counts (count1, count2).

4. Traverse the array:
      - If the current number matches a candidate,
        increment its count.
      - If count1 becomes 0, assign current number
        as candidate1.
      - Else if count2 becomes 0, assign current number
        as candidate2.
      - Otherwise decrement both counts.

5. After the first pass, candidate1 and candidate2
   are the potential majority elements.

6. Verify their actual frequencies in a second pass.

7. Add candidates whose frequency is greater than n/3
   to the result list.

TC: O(n)
SC: O(1)

/*
If there were 3 elements appearing more than n/3 times:

3 × (n/3 + 1) > n

which is impossible.

Therefore, at most 2 elements can occur more than n/3 times,
so we only need to track 2 candidates.
*/

