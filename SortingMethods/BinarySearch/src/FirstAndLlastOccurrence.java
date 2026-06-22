
/*
Problem: Find First and Last Occurrence of an Element in a Sorted Array

Approach:
1. Use Binary Search to find the first occurrence:
   - If target is found, store the index and continue searching on the left.
2. Use Binary Search to find the last occurrence:
   - If target is found, store the index and continue searching on the right.
3. Return both indices.
4. If the target is not present, return {-1, -1}.

Time Complexity: O(log N)
Space Complexity: O(1)
*/

import java.util.*;

public class FirstAndLlastOccurrence {

    // Find first occurrence
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // Move left
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

    // Find last occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // Move right
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

    public static int[] searchRange(int[] arr, int target) {
        return new int[]{
                firstOccurrence(arr, target),
                lastOccurrence(arr, target)
        };
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int[] ans = searchRange(arr, target);

        System.out.println("First Occurrence: " + ans[0]);
        System.out.println("Last Occurrence: " + ans[1]);
    }
}
