/*
Problem: Find Minimum in Rotated Sorted Array

Approach:
1. The array is originally sorted in ascending order and then rotated.
2. The minimum element is the only element where the sorted order breaks.
3. Use Binary Search:
   - If arr[mid] > arr[high], the minimum lies in the right half.
   - Otherwise, the minimum lies in the left half (including mid).
4. When low == high, we have found the minimum element.

Time Complexity: O(log N)
Space Complexity: O(1)
*/

import java.util.*;

public class findMinInRotatedArray {

    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Minimum is in the right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            // Minimum is in the left half (including mid)
            else {
                high = mid;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findMin(arr));
    }
}
