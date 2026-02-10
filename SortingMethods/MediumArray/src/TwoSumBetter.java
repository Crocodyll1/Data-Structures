import java.util.Arrays;

public class TwoSumBetter {
    public static void main(String[] args) {




                int[] arr = {2, 5, 3, 6, 7, 8};
                int target = 13;
                Arrays.sort(arr);

                int start = 0;
                int end = arr.length - 1;

                while (start < end) {
                    int sum = arr[start] + arr[end];

                    if (sum == target) {
                        System.out.println("Pair found: " + arr[start] + ", " + arr[end]);
                        return;
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


        /*
        Two Sum problem with better approach
        TC = O(n log n)
        step 1 = sort the array
        step 2 = compare sum of start and end with sum
        step 3 = print the result
         */



