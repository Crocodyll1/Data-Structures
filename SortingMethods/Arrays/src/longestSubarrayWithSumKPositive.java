public class longestSubarrayWithSumKPositive {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,12,3,4,6,1};
        int target = 11;
        int n = arr.length;
        int count = 0;
        for(int i =0; i<n; i++){
            int sum =0;
            for(int j =i; j<n; j++){
                sum += arr[j];
                if(sum == target ) count++;
            }
        }
        System.out.println(count);
    }
}

/* here we printing the no. of subarray that sum up 11
TC = O(N^2)
SC = O(1)
 */
