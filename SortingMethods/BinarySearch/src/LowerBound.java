
class LowerBound {

    public int lowerBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {

            // Find middle index
            int mid = low + (high - low) / 2;

            // Current element can be a lower bound
            if (arr[mid] >= target) {
                ans = mid;

                // Search on left side for a smaller index
                high = mid - 1;
            }

            // Lower bound must be on right side
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
