class Solution {
    public int max(int[] weights){
        int maxi = 0;
        for(int num : weights){
            maxi = Math.max(maxi,num);
        }
        return maxi;
    }

    public Boolean day(int[] weights, int mid, int days){
        int day = 1;
        int load = 0;

        for(int num : weights){
            if(num + load > mid){
                day++;
                load = num;
            }
            else{
                load += num;
            }
        }
        return day<=days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = Arrays.stream(weights).sum();

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