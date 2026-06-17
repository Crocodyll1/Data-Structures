
import java.util.*;

public class RotatedSortedArray {

    // Function to perform Binary Search
    public static int binarySearch(int[] arr, int target) {

        // Start pointer
        int left = 0;

        // End pointer
        int right = arr.length - 1;

        // Continue until search space is valid
        while (left <= right) {

            // Find middle element safely
            // Using this formula prevents integer overflow
            int mid = left + (right - left) / 2;

            // Target found
            if (arr[mid] == target) {
                return mid;
            }

            // Target is greater than middle element
            // Search in the right half
            else if (arr[mid] < target) {
                left = mid + 1;
            }

            // Target is smaller than middle element
            // Search in the left half
            else {
                right = mid - 1;
            }
        }

        // Target not present in array
        return -1;
    }

    public static void main(String[] args) {

        // Sorted array (Binary Search works only on sorted arrays)
        int[] arr = {2, 5, 8, 12, 16, 23, 38};

        // Element to search
        int target = 16;

        // Call Binary Search
        int result = binarySearch(arr, target);

        // Print result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
