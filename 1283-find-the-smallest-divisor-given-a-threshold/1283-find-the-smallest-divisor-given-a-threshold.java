class Solution {
    public int max(int[] nums){
        int maxi = nums[0];
        for(int num : nums){
            maxi = Math.max(maxi, num);
        }
        return maxi;
    }

    public Boolean div(int[] nums, int mid, int threshold){
        int ans = 0;

        for(int num : nums){
            ans += (num + mid -1)/mid;
        }
        if(ans > threshold){
            return false;
        }
        return true;

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);

        while(low < high){
            int mid = low + (high - low)/2;

            if(div(nums, mid, threshold)){
               
                high = mid;

            }
            else{
                 low = mid + 1;
            }
        }
        return low;
    }
}