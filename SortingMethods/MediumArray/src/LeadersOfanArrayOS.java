import java.util.*;


public class LeadersOfanArrayOS {
    public static ArrayList<Integer> Leader(int[] arr){

        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = n-1; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                ans.add(arr[i]);
            }

        }
        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(Leader(arr));
    }

}

/*

Steps :
* Traverse from right to left.
* Keep maximum element.
* If current element > max:
  add to answer
  update max
* Reverse the answer list.
* Time Complexity : O(N)
* Space Complexity : O(N)

(for storing leaders)
 */