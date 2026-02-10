import java.util.Arrays;

public class TwoSumBetter {
    public static void main(String[] args) {




                int[] arr = {2, 5, 3, 6, 7, 8};
                int target = 13;

                // Step 1: Sort the array
                Arrays.sort(arr);

                int start = 0;
                int end = arr.length - 1;

                while (start < end) {
                    int sum = arr[start] + arr[end];

                    if (sum == target) {
                        System.out.println("Pair found: " + arr[start] + ", " + arr[end]);
                        return; // exit after finding one pair
                    }
                    else if (sum > target) {
                        end--;
                    }
                    else {
                        start++;
                    }
                }

                System.out.println("No pair found");
            }
        }




