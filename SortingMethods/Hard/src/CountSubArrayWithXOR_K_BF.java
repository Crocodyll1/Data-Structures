
import java.util.*;

public class CountSubArrayWithXOR_K_BF {

    public static int subarraysWithXorK(int[] nums, int k) {

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            int xor = 0;

            for (int j = i; j < n; j++) {

                xor ^= nums[j];

                if (xor == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;

        System.out.println(subarraysWithXorK(nums, k));
    }
}
