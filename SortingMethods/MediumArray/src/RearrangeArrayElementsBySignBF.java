
import java.util.*;

public class RearrangeArrayElementsBySignBF {

    public static int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = rearrangeArray(nums);

        // Print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
