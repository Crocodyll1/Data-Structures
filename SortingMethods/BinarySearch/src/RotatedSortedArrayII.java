
class RotatedSortedArrayII {

    public boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // Find middle index
            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Duplicates prevent identifying sorted half
            if (nums[start] == nums[mid] &&
                    nums[mid] == nums[end]) {

                start++;
                end--;
                continue;
            }

            // Check if left half is sorted
            if (nums[start] <= nums[mid]) {

                // Target lies inside left sorted half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                }

                // Search in right half
                else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies inside right sorted half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                }

                // Search in left half
                else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}
