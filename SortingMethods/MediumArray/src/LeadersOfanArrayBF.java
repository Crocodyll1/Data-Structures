import java.util.*;

public class LeadersOfanArrayBF {
    public static ArrayList<Integer> leader(int[] arr){
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();


        for(int i = 0; i < n; i++){
            boolean leader = true;
            for(int j = i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};

        System.out.println(leader(arr));
    }
}

/*
Steps:
* Pick each element.
* Check all elements on right side.
* If no greater element found, it is a leader.
* Add it to answer.

Time Complexity : O(N*2)

Space Complexity : O(N)
 */