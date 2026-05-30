import java.util.*;

public class LongestConsecutiveSequenceBF {

    public static Boolean linearSearch(int[] nums, int target){
        for(int num : nums){
            if(num == target){
                return true;
            }

        }
        return false;
    }
    public static int LongestConsecutive(int[] nums){

        int n = nums.length;

        int longest = 0;

        for(int i=0; i <n; i++){

            int x = nums[i];
            int count = 1;

            while(linearSearch(nums, x+1)){
                x = x + 1;
                count++;
            }
            longest = Math.max(longest,count);



        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {200,100,1,4,101,2,6,102,3,107,4,194,5};

        System.out.println("max consecutive count is : "+ LongestConsecutive(nums));
    }

    /*
   Idea

For every element x in the array:

- Check if x + 1 exists in the array.
- Then check if x + 2 exists, and so on.
- Count the length of the consecutive sequence starting from x.
- Keep track of the maximum length.

Time Complexity:
Searching an element in the array takes O(N).
For each element, we may search up to N times.
Overall: O(N³) in the worst case.

Space Complexity- O(1)
     */
}
