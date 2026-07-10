class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int[] n3 = new int[n1 +n2];

        int i = 0, k=0, j=0;

        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                n3[k++] = nums1[i++];
            }
            else{
                n3[k++] = nums2[j++];
            }
        }
        while(i < n1){
        n3[k++] = nums1[i++];
        }

        while(j < n2){
         n3[k++] = nums2[j++];
        }
        int n = n3.length;
        if(n %2 !=0){
            return n3[n/2];
        }
        return ((n3[n/2] + ((n3[n/2-1])))/2.0);
    }
}