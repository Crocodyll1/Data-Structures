
/*
Problem: Floor and Ceil in a Sorted Array

Floor:
- Largest element <= target

Ceil:
- Smallest element >= target

Approach:
1. Use Binary Search.
2. For Floor:
   - If arr[mid] <= target, store it as a potential answer
     and search on the right side.
   - Otherwise, search on the left side.
3. For Ceil:
   - If arr[mid] >= target, store it as a potential answer
     and search on the left side.
   - Otherwise, search on the right side.

Time Complexity: O(log N)
Space Complexity: O(1)
*/

import java.util.*;

public class FloorAndCeil {

    // Find Floor
    public static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Find Ceil
    public static int ceil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12};
        int target = 5;

        System.out.println("Floor: " + floor(arr, target));
        System.out.println("Ceil: " + ceil(arr, target));
    }
}
