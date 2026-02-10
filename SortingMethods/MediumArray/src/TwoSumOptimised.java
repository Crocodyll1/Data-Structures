import com.sun.jdi.ArrayType;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimised {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6, 7, 8};
        int n = arr.length;
        int target = 13;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0; i<n; i++) {
            int reqnum = target - arr[i];
            if (hm.containsKey(reqnum)) {
                int[] nums = {hm.get(reqnum), i};
                System.out.println(Arrays.toString(nums));
                return;
            }
            hm.put(arr[i], i);


        }
        System.out.println(("null"));
    }
}

/*
Two sum Optimised approach
TC = O(n)
 */
