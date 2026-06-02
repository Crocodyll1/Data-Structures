public class CountSubarraySumEqualsKBF {
    public static int count(int[] nums, int k){
        int n = nums.length;
        int count = 0;

        for(int i = 0; i<n; i++){
            int sum =0;
            for(int j =i; j<n; j++){
                sum += nums[j];

                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,2,5,3,6,8,3,4,2,2,2,1,9};

        int totalCount = count(nums, 6);
        System.out.println(totalCount);
    }


}



/*
TC = O(N²)

SC = O(1)
 */