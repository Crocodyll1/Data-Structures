public class TwoSum {
    public static void main(String[] args) {

        int[] arr = { 2,5,3,6,7,8};
        int target = 13;
        int n =arr.length;

        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println( i + " " + j);

                }

            }
        }
    }
}


/* 2Sum
tc = O(N^2)
 */