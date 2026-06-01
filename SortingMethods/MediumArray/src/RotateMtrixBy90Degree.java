import java.util.*;

public class RotateMtrixBy90Degree {
    public static void RotteMatrix(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;

        int[][] ans = new int[n][m];

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                ans[j][n-1-i] = nums[i][j];
            }
        }
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                nums[i][j] = ans[i][j];
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
Brute Force Approach (Without Example)
Intuition:
When a matrix is rotated 90° clockwise, every element changes its position. Since modifying positions directly can overwrite existing values, we create a temporary matrix and store the rotated values there.

Steps:
Create a new matrix temp[n][n].
Traverse every element matrix[i][j].

Place it at its rotated position:

4. Copy all elements from temp back to matrix.
Why this works?
i represents the row index.
j represents the column index.
After a 90° clockwise rotation:
Row becomes column (j).
Column position becomes n - 1 - i.


Time Complexity: O(N²)
Space Complexity: O(N²)
 */
