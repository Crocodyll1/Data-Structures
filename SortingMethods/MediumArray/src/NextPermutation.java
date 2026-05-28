import java.util.*;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find breakpoint
        int idx = -1;
        for(int i =n-2; i >=0; i --){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        // Step 2: If no breakpoint exists
        if(idx == -1){
            reverse(nums,0,n-1);
            return;
        }
        // Step 3: Find next greater element and swap
        for(int i = n-1; i > idx; i--){
            if(nums[i] > nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        // Step 4: Reverse the right half
        reverse(nums,idx+1,n-1);

    }
    // Swap function
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // Reverse function
    public static void reverse(int[] nums, int start, int end){
        while( start < end){
            swap(nums, start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,7,8};

        nextPermutation(nums);
        System.out.print("Next Permutation of Nums is :");
        System.out.println(Arrays.toString(nums));
    }
}


/*
Steps
* Find breakpoint from right where:
  nums[i]<nums[i+1]
* Find next greater element from right.
* Swap both elements.
* Reverse remaining right part.
Time Complexity : O(N)
Space Complexity : O(1)
 */
