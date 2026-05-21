import java.util.*;
public class RearrangeArrayElementsBySignBF{

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
        for(int i =0; i<nums.length/2; i++){
            nums[2*i] = positive.get(i);
            nums[2*i+1] = negative.get(i);
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] nums = {3,1,-1,-4,2,-6};
        int[] result = rearrange(nums);
        System.out.println(Arrays.toString(result));

    }
}

/*
TC = O(n) + O(n)
SC = O(n)
Easy Steps:
 Create two lists:
 one for positive numbers
 one for negative numbers
 Traverse the array.
 Store positives and negatives separately.
 Place positive numbers at even indexes.
 Place negative numbers at odd indexes.
 */