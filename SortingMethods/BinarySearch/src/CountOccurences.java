
/*
Problem: Count Occurrences in a Sorted Array

Approach:
1. Use Binary Search to find the first occurrence of the target.
2. Use Binary Search again to find the last occurrence of the target.
3. If the target is not found, return 0.
4. Otherwise, count = lastOccurrence - firstOccurrence + 1.

Time Complexity: O(log N)
Space Complexity: O(1)
*/

import java.util.*;

public class CountOccurences {

    // Find first occurrence of target
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // Search on left side
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return first;
    }

    // Find last occurrence of target
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // Search on right side
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return last;
    }

    public static int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);

        // Target not present
        if (first == -1) {
            return 0;
        }

        int last = lastOccurrence(arr, target);

        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        System.out.println(countOccurrences(arr, target));
    }
}
