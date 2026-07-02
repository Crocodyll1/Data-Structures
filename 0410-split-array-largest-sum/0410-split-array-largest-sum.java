class Solution {
    
    public boolean books(int[] nums, int maxPages, int students){
        int student = 1;
        int pages = 0;
        
        for(int i =0; i<nums.length; i++){
            if(nums[i] + pages <= maxPages ){
                pages += nums[i];
            }
            else{
                student ++;
                pages = nums[i];
            }
        }
        if(student > students){
            return false;
        }
        return true;
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int high = 0;
        int sum = 0;
        int ans = 0;
        
        for(int num : arr){
            sum += num;
            high = Math.max(high, num);
        }
        if(k > arr.length){
            return -1;
        }
        
        while( high <= sum){
            int mid = high + (sum - high)/2;
            
            if(books(arr, mid, k)){
                ans = mid;
                sum = mid -1;
            }
            else{
                high = mid + 1;
            }
        }
        return ans;
    }
}