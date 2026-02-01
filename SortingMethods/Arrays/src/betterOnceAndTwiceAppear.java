public class betterOnceAndTwiceAppear {
    public static void main(String[] args) {
        int[] arr= {1,1,2,3,3,4,4,5,5};
        int n = arr.length;
        int maxi = arr[0];
        for(int i =0; i<n; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        int[] hash = new int[maxi + 1];
        for (int j : arr) {
            hash[j] += 1;
        }
        for(int i =0; i<=n; i++){
            if(hash[arr[i]] == 1){
                System.out.println(arr[i]);
            }
        }

    }
}

/* better approach to find the once and twice appearance
TC = O(N)
SC = O(maxi)
 */
