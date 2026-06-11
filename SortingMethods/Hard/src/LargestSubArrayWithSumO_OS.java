
import java.util.*;

public class LargestSubArrayWithSumO_OS {

    public static int maxLen(int[] arr) {

        HashMap<Integer, Integer> record = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Subarray from 0 to i
            if (sum == 0) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Prefix sum already seen
            if (record.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - record.get(sum));
            } else {
                // Store first occurrence only
                record.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(maxLen(arr));
    }
}