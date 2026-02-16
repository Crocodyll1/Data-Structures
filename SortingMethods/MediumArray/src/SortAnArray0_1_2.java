import java.util.Arrays;

public class SortAnArray0_1_2 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int n = arr.length;

//        for(int i = 0; i < n - 1; i++) {
//            for(int j = 0; j < n - i - 1; j++) {
//
//                if(arr[j] > arr[j + 1]) {
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        Arrays.sort(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }



    }
}

/* Sort an array of 0,1,2
Brute force approach
TC = O(N^N)
 */