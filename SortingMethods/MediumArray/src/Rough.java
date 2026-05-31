/*longest Consecutive Sequence Optimised Approach*/
import java.util.*;

public class Rough {

    public static int LongestConsecutive(int[] nums){
        int n = nums.length;
        if(n == 0){
            return 0;
        }
       HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int longest = 0;


        for(int num : set){
            if(!set.contains(num -1)){

                int count = 1;
                int currNum = num;

                while(set.contains(currNum+1)){
                    count++;
                    currNum++;
                }
                longest = Math.max(longest,count);
            }

        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {200,100,1,4,2,3,5,4,6,201};

        System.out.println("Longest Consecutive Sequence : " + LongestConsecutive(nums));
    }
}
