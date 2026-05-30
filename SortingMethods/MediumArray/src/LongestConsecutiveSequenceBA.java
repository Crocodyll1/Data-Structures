import java.util.*;

public class LongestConsecutiveSequenceBA {
    public static int LongestConsecutive(int[] nums){
        int n = nums.length;

        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);

        int count = 1;
        int longest = 1;

        for(int i = 1; i<n; i++){

            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                count += 1;

            }else{
                count = 1;
            }
            longest = Math.max(longest,count);

        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2,5,4};
        System.out.println("longest Consecutive Sequence is : " + LongestConsecutive(nums));


    }
}


/*
Idea :
- Sort the array.
- Traverse it once.
- If the current element is exactly prev + 1, increase the count.
- If it's a duplicate, ignore it.
- Otherwise, start a new sequence.
- Keep updating the maximum length.

Time Complexity :
- Sorting: O(N log N)
- Traversal: O(N)
- Overall: O(N log N)

Space Complexity :
- O(1) (ignoring the space used internally by the sorting algorithm)
 */