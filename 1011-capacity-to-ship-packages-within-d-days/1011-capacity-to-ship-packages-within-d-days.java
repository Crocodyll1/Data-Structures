class Solution {
    

    public Boolean day(int[] weights, int mid, int days){
        int day = 1;
        int load = 0;

        for(int num : weights){
            if(num + load > mid){
                day++;
                load = num;

                if(day > days)return false;
            }
            else{
                load += num;
            }
        }
        return true;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int max= 0;
        int sum=0;
        for(int num : weights){
            max = Math.max(max, num);
            sum += num;
        }
        
        int low = max;
        int high = sum;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(day(weights, mid , days)){
                high = mid - 1;

            }
            else{
                low = mid + 1; 
            }
        }
        return low;

    }
}