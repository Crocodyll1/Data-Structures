import java.util.*;
public class RearrangeOfArrayVarietyBF{

    public static int[] rearrange(int[] nums){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int num : nums){
            if(num > 0){
                positive.add(num);
            }
            else{
                negative.add(num);
            }
        }

        if(positive.size() > negative.size()){
            for(int i =0; i<negative.size(); i++){
                nums[2*i] = positive.get(i);
                nums[2*i+1] = negative.get(i);
            }
            int idx = 2 * negative.size();
            for(int i = negative.size();i<positive.size(); i++){
                nums[idx] = positive.get(i);
                idx++;
            }
        }else{
            for(int i =0; i<positive.size(); i++){
                nums[2*i] = positive.get(i);
                nums[2*i+1] = negative.get(i);
            }
            int idx = 2 * positive.size();
            for(int i = positive.size();i<negative.size(); i++){
                nums[idx] = negative.get(i);
                idx++;
            }
        }


        return nums;

    }
    public static void main(String[] args) {
        int[] nums = {3,1,-1,-4,2,-6,-4,-9};
        int[] result = rearrange(nums);
        System.out.println(Arrays.toString(result));

    }
}

/*
Time Complexity = O(n)
Space Complexity= O(n) (because of two ArrayLists)
1. Create two ArrayLists:

   * one for positive numbers
   * one for negative numbers

2. Traverse the array and store:

   * positives in positive list
   * negatives in negative list

3. Find the minimum size of both lists.

4. Place positive and negative elements alternatively in the original array:

   * positive at even index
   * negative at odd index

5. Add the remaining extra elements (positive or negative) at the end of the array.

 */


