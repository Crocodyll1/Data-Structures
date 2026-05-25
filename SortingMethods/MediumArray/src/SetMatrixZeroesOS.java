import java.util.*;

public class SetMatrixZeroesOS {

    public static void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int col0 = 1;

        // Step 1: Mark rows and columns
        for (int i = 0; i < n; i++) {

            if (matrix[i][0] == 0) {
                col0 = 0;
            }

            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Traverse from back and set zeroes
        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 1; j--) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}


/*
Time Complexity
O(N × M)
Space Complexity
O(1)

5 Steps to Solve:
Use first row and first column as markers.
Traverse matrix and mark rows/columns containing 0.
Store first column state in col0.
Traverse matrix backward and set zeroes using markers.
Finally handle first column using col0.
 */