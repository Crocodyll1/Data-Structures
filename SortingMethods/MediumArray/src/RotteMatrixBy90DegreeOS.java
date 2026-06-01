import java.util.*;

public class RotteMatrixBy90DegreeOS {
    public static void RotteMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0; i<n-1; i++){
            for(int j =i+1; j<m; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0; i<n; i++) {
            int right = n - 1;
            int left = 0;
            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                right--;
                left++;
            }
        }
    }
    public static void printingMtrix(int[][] nums){
        for(int[] row : nums){
            for(int num : row){
                System.out.print( num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        System.out.println("Matrix before : ");
        printingMtrix(matrix);

        RotteMatrix(matrix);

        System.out.println(" Matrix after rotation : ");
        printingMtrix(matrix);

    }
}

/*
Optimal Approach:

1. Transpose the matrix:
   - Swap matrix[i][j] with matrix[j][i].
   - This converts rows into columns.

2. Reverse every row:
   - Use two pointers (left and right).
   - Swap elements until left < right.

By performing transpose followed by row reversal,
the matrix gets rotated by 90 degrees clockwise in-place.

Time Complexity: O(N²)
Space Complexity: O(1)
*/