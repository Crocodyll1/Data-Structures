import java.util.*;

public class III_Sum_BF {
    public static List<List<Integer>> thtreesum(int[] nums){
        Set<List<Integer>> result = new HashSet<>();

         int n =nums.length;
         for(int i =0; i<n; i++){
             for(int j =i+1; j<n; j++){
                 for(int k =j+1; k<n; k++){

                     if(nums[i] + nums[j] + nums[k] == 0) {
                         List<Integer> temp = Arrays.asList(
                                 nums[i],
                                 nums[j],
                                 nums[k]

                         );
                         Collections.sort(temp);
                         result.add(temp);
                     }
                 }
             }
         }
         return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        III_Sum_BF obj = new III_Sum_BF();
        int[] nums = {1,2,-1,0,0,3,-2,-3};

        List<List<Integer>> result =  obj.thtreesum(nums);

        System.out.println(result);


    }

}

/*
Brute Force Approach:

1. Use three nested loops to generate all possible triplets.
2. Check if the sum of the triplet is 0.
3. Sort the triplet and store it in a HashSet to avoid duplicates.
4. Convert the HashSet into a List and return it.

Time Complexity: O(n^3)
Space Complexity: O(m)

*/



