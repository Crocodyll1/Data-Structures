import java.util.*;

public class IV_Sum_BF {
    public static List<List<Integer>> FourSum(int[] nums, int target){
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        int sum =0;

        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    for(int l = k+1; l<n; l++){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            List<Integer> Quads = new ArrayList<>();
                            Quads.add(nums[i]);
                            Quads.add(nums[j]);
                            Quads.add(nums[k]);
                            Quads.add(nums[l]);

                            Collections.sort(Quads);
                            result.add(Quads);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        IV_Sum_BF obj = new IV_Sum_BF();
        int[] nums = {1,2,-1,0,0,3,-2,-3};
        int target = 3;

        List<List<Integer>> result =  obj.FourSum(nums,target);

        System.out.println(result);


    }
}

/*
 * Brute Force Approach:
 *
 * 1. Use four nested loops to generate every possible quadruplet.
 *    - i selects the first element.
 *    - j selects the second element.
 *    - k selects the third element.
 *    - l selects the fourth element.
 *
 * 2. For each quadruplet, calculate:
 *      nums[i] + nums[j] + nums[k] + nums[l]
 *
 * 3. If the sum equals the target:
 *      - Create a list containing the four elements.
 *      - Sort the list so that identical quadruplets have the same order.
 *      - Insert the sorted quadruplet into a HashSet.
 *
 * 4. HashSet automatically removes duplicate quadruplets.
 *
 * 5. Convert the HashSet into a List and return the result.
 *
 * Time Complexity:
 *      O(n^4)
 *      Four nested loops generate all possible quadruplets.
 *
 * Space Complexity:
 *      O(m)
 *      where m = number of unique quadruplets stored in the HashSet.
 */
