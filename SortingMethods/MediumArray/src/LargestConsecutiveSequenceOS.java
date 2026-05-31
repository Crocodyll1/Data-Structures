import java.util.*;

public class LargestConsecutiveSequenceOS {
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
            if(!set.contains(num-1)){
                int currentNum =  num;
                int count = 1;

                while(set.contains(currentNum+1)){
                    count++;
                    currentNum++;

                }
                longest = Math.max(longest,count);

            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {2,200,1,201,3,5,4,204,203};
        System.out.println("longest consecutive Sequence : "+ LongestConsecutive(nums));
    }
}
