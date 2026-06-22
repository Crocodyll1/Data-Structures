
/*
Problem: Find out how many times a sorted array has been rotated.

Approach:
1. In a rotated sorted array, the index of the minimum element
   represents the number of rotations.
2. Use Binary Search to find the minimum element efficiently.
3. If arr[mid] > arr[high], the minimum lies in the right half.
4. Otherwise, the minimum lies in the left half (including mid).
5. When low == high, we have found the index of the minimum element,
   which is the answer.

Time Complexity: O(log N)
Space Complexity: O(1)
*/

import java.util.*;

public class numberOfTimesArrayRotated {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Minimum element is in the right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            // Minimum element is in the left half (including mid)
            else {
                high = mid;
            }
        }

        // Index of minimum element = number of rotations
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};

        System.out.println(findKRotation(arr));
    }
}
