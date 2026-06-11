
import java.util.*;

public class CountSubArrayWithXOR_K_OS {

    public static int subarraysWithXorK(int[] nums, int k) {

        // prefixXor -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int count = 0;

        // Empty prefix XOR
        map.put(0, 1);

        for (int num : nums) {

            // Current prefix XOR
            xor ^= num;

            // Required previous prefix XOR
            int target = xor ^ k;

            // Add all matching prefixes
            count += map.getOrDefault(target, 0);

            // Store current XOR frequency
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;

        System.out.println(subarraysWithXorK(nums, k));
    }
}
