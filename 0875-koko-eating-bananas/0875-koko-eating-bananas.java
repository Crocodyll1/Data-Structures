class Solution {

    public int findMax(int[] nums){
        int max = 0;

        for(int num : nums){
            
            max = Math.max(max,num);
            
        }
        return max;
    }
    public Boolean banana(int[] piles, int mid, int h){
        long totalBanana= 0;
        
        for(int num : piles){
            totalBanana += (num + mid -1)/mid;

            

        }
        if(totalBanana > h){
            return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = 0;

        while(low < high){
            int mid = low + (high - low)/2; // banana/h

            if(banana(piles,mid,h)){
                
                high = mid;
            }
            else{
                low = mid +1; 
            }
        }
        return low;
    }
}